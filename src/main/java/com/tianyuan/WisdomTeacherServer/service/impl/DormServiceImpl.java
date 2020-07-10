package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.SchoolDorm;
import com.tianyuan.WisdomTeacherServer.mapper.SchoolDormMapper;
import com.tianyuan.WisdomTeacherServer.service.DormService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DormServiceImpl implements DormService {

    @Autowired
    private SchoolDormMapper schoolDormMapper;

    @Override
    public SchoolDorm searchSchoolDorm(Integer id) {
        if (!"".equals(id)){
            SchoolDorm schoolDorm = schoolDormMapper.selectByPrimaryKey(id);
            return schoolDorm;
        }else {
            return null;
        }
    }

    @Override
    public boolean insertDorm(SchoolDorm schoolDorm) {
        int count = schoolDormMapper.insertSelective(schoolDorm);
        if ( count > 0 ){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean updateDorm(SchoolDorm schoolDorm) {
        int count = schoolDormMapper.updateByPrimaryKeySelective(schoolDorm);
        if ( count > 0 ){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean deleteDorm(Integer id) {
        int count = schoolDormMapper.deleteByPrimaryKey(id);
        if ( count > 0 ){
            return  true;
        }else{
            return false;
        }
    }

    @Override
    public List<SchoolDorm> findAll() {
        List<SchoolDorm> schoolDorms = schoolDormMapper.findAll();
        return  schoolDorms;
    }

    @Override
    public Integer countItem() {
        Integer countItem = schoolDormMapper.countItem();
        return countItem;
    }
}
