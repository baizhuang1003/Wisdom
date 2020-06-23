package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolDorm;
import com.tianyuan.WisdomTeacherServer.bean.SchoolDormKey;

public interface SchoolDormMapper {
    int deleteByPrimaryKey(SchoolDormKey key);

    int insert(SchoolDorm record);

    int insertSelective(SchoolDorm record);

    SchoolDorm selectByPrimaryKey(SchoolDormKey key);

    int updateByPrimaryKeySelective(SchoolDorm record);

    int updateByPrimaryKey(SchoolDorm record);
}