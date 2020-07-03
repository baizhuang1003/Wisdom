package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolClass;

import java.util.List;

public interface SchoolClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolClass record);

    int insertSelective(SchoolClass record);

    SchoolClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolClass record);

    int updateByPrimaryKey(SchoolClass record);

    List<SchoolClass> classList(Integer gradeId);

    List<SchoolClass> findAll();

    Integer countItem();
}