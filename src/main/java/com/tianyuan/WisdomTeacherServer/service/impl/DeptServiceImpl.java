package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.SchoolDept;
import com.tianyuan.WisdomTeacherServer.mapper.SchoolDeptMapper;
import com.tianyuan.WisdomTeacherServer.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private SchoolDeptMapper schoolDeptMapper;
    public SchoolDept searchDept(Integer id){
        SchoolDept schoolDept = schoolDeptMapper.selectByPrimaryKey(id);
        return schoolDept;
    }

    public boolean insertDept(SchoolDept schoolDept) {
        int count = schoolDeptMapper.insert(schoolDept);
        if (count > 0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateDept(SchoolDept schoolDept) {
        int count = schoolDeptMapper.updateByPrimaryKeySelective(schoolDept);
        if (count > 0) {
            return true;
        }else {
            return false;
        }
    }

    public boolean deleteDept(Integer id) {
        int count = schoolDeptMapper.deleteByPrimaryKey(id);
        if (count > 0 ){
            return  true;
        }else {
            return false;
        }
    }

    @Override
    public List<SchoolDept> findAll(String id) {
        if (!"".equals(id)){
            List<SchoolDept> all = schoolDeptMapper.findAll();
            return all;
        }else{
            List<SchoolDept> all = schoolDeptMapper.findByPid(Integer.parseInt(id));
            return all ;
        }
    }

    @Override
    public Integer countItem() {
        Integer countItem = schoolDeptMapper.countItem();
        return countItem;
    }
}
