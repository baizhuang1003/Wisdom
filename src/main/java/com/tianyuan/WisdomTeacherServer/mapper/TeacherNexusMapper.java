package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.TeacherNexus;
import com.tianyuan.WisdomTeacherServer.bean.TeacherNexusKey;

public interface TeacherNexusMapper {
    int deleteByPrimaryKey(TeacherNexusKey key);

    int insert(TeacherNexus record);

    int insertSelective(TeacherNexus record);

    TeacherNexus selectByPrimaryKey(TeacherNexusKey key);

    int updateByPrimaryKeySelective(TeacherNexus record);

    int updateByPrimaryKey(TeacherNexus record);
}