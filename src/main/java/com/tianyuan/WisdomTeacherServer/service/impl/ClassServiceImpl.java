package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.SchoolClass;
import com.tianyuan.WisdomTeacherServer.mapper.SchoolClassMapper;
import com.tianyuan.WisdomTeacherServer.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private SchoolClassMapper schoolClassMapper;

    @Override
    public SchoolClass searchClass(Integer id) {
        SchoolClass schoolClass = schoolClassMapper.selectByPrimaryKey(id);
        if (schoolClass != null){
            return  schoolClass;
        }else{
            return null;
        }

    }

    public boolean insertClass(SchoolClass schoolClass){
        int count = schoolClassMapper.insert(schoolClass);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateClass(SchoolClass schoolClass){
        int count = schoolClassMapper.updateByPrimaryKeySelective(schoolClass);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteClass(Integer id){
        int count = schoolClassMapper.deleteByPrimaryKey(id);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<SchoolClass> findAll(String gradeId) {
        if(gradeId != null && !"".equals(gradeId)){
            List<SchoolClass> schoolClasses = schoolClassMapper.classList(Integer.parseInt(gradeId));
            return schoolClasses;
        }else{
            List<SchoolClass> schoolClasses = schoolClassMapper.findAll();
            return schoolClasses;
        }
        //

    }

    @Override
    public Integer countItem() {
        Integer countItem = schoolClassMapper.countItem();
        return countItem;
    }
}
