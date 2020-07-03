package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolTerm;

import java.util.List;

public interface SchoolTermMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolTerm record);

    int insertSelective(SchoolTerm record);

    SchoolTerm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolTerm record);

    int updateByPrimaryKey(SchoolTerm record);

    List<SchoolTerm> findAll();

    int countItem();
}