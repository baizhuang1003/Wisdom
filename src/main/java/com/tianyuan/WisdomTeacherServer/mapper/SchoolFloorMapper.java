package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolFloor;

public interface SchoolFloorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolFloor record);

    int insertSelective(SchoolFloor record);

    SchoolFloor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolFloor record);

    int updateByPrimaryKey(SchoolFloor record);
}