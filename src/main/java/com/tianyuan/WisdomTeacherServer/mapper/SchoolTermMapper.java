package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolTerm;
import com.tianyuan.WisdomTeacherServer.bean.SchoolTermKey;

public interface SchoolTermMapper {
    int deleteByPrimaryKey(SchoolTermKey key);

    int insert(SchoolTerm record);

    int insertSelective(SchoolTerm record);

    SchoolTerm selectByPrimaryKey(SchoolTermKey key);

    int updateByPrimaryKeySelective(SchoolTerm record);

    int updateByPrimaryKey(SchoolTerm record);
}