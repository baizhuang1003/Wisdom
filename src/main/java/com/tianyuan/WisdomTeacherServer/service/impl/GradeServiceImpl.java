package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.SchoolClass;
import com.tianyuan.WisdomTeacherServer.bean.SchoolGrade;
import com.tianyuan.WisdomTeacherServer.mapper.SchoolGradeMapper;
import com.tianyuan.WisdomTeacherServer.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private SchoolGradeMapper schoolGradeMapper;


    @Override
    public SchoolGrade searchGrade() {
        SchoolGrade schoolGrade = schoolGradeMapper.selectByPrimaryKey(1);
        return schoolGrade;
    }

    @Override
    public boolean insertGrade(SchoolGrade schoolGrade) {
        int count = schoolGradeMapper.insertSelective(schoolGrade);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean updateGrade(SchoolGrade schoolGrade) {
        int count =schoolGradeMapper.updateByPrimaryKeySelective(schoolGrade);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteGrade(Integer id) {
        int count = schoolGradeMapper.deleteByPrimaryKey(id);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<SchoolGrade> findAll() {
        List<SchoolGrade> schoolGrades = schoolGradeMapper.findAll();
        return schoolGrades;
    }

    @Override
    public Integer countItem() {
        return null;
    }
}
