package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolGrade;

import java.util.List;

public interface SchoolGradeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolGrade record);

    int insertSelective(SchoolGrade record);

    SchoolGrade selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolGrade record);

    int updateByPrimaryKey(SchoolGrade record);

    List<SchoolGrade> findAll();

    int countItem();
}