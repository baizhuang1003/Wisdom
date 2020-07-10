package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolDorm;

import java.util.List;

public interface SchoolDormMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolDorm record);

    int insertSelective(SchoolDorm record);

    SchoolDorm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolDorm record);

    int updateByPrimaryKey(SchoolDorm record);

    List<SchoolDorm> findAll();

    Integer countItem();
}