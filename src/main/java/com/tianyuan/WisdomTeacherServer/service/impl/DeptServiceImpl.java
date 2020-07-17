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

    /**
     * 通过部门ID 查新部门详细内容
     * @param id 部门id
     * @return
     */
    public SchoolDept searchDept(Integer id){
        SchoolDept schoolDept = schoolDeptMapper.selectByPrimaryKey(id);
        return schoolDept;
    }

    /**
     * 通过学校id查询所属学校所有部门
     * @param schoolid 学校id
     * @param id 部门id
     * @return
     */
    @Override
    public SchoolDept searchDeptBySchoolid(String schoolid, String id) {
        SchoolDept schoolDept = schoolDeptMapper.selectBySchoolAndId(Integer.valueOf(schoolid),Integer.parseInt(id));
        return schoolDept;
    }

    /**
     * 添加部门
     * @param schoolDept  部门类
     * @return
     */
    public boolean insertDept(SchoolDept schoolDept) {
        int count = schoolDeptMapper.insert(schoolDept);
        if (count > 0) {
            return true;
        }else {
            return false;
        }
    }

    /**
     * 修改部门
     * @param schoolDept  部门类
     * @return
     */
    @Override
    public boolean updateDept(SchoolDept schoolDept) {
        int count = schoolDeptMapper.updateByPrimaryKeySelective(schoolDept);
        if (count > 0) {
            return true;
        }else {
            return false;
        }
    }

    /**
     * 通过部门id删除部门
     * @param id  部门id
     * @return
     */
    public boolean deleteDept(Integer id) {
        int count = schoolDeptMapper.deleteByPrimaryKey(id);
        if (count > 0 ){
            return  true;
        }else {
            return false;
        }
    }

    /**
     * 查询学校所有部门
     * @param id
     * @return
     */
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

    /**
     * 总条数
     * @return
     */
    @Override
    public Integer countItem() {
        Integer countItem = schoolDeptMapper.countItem();
        return countItem;
    }
}
