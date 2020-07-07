package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolDept;

import java.util.List;

public interface SchoolDeptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolDept record);

    int insertSelective(SchoolDept record);

    SchoolDept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolDept record);

    int updateByPrimaryKey(SchoolDept record);

    List<SchoolDept> findAll();

    List<SchoolDept> findByPid(Integer id);

    Integer countItem();

}