package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.StudentLeave;

public interface StudentLeaveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentLeave record);

    int insertSelective(StudentLeave record);

    StudentLeave selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentLeave record);

    int updateByPrimaryKey(StudentLeave record);
}