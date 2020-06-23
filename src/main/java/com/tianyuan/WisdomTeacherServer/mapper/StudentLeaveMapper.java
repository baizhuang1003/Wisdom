package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.StudentLeave;
import com.tianyuan.WisdomTeacherServer.bean.StudentLeaveKey;

public interface StudentLeaveMapper {
    int deleteByPrimaryKey(StudentLeaveKey key);

    int insert(StudentLeave record);

    int insertSelective(StudentLeave record);

    StudentLeave selectByPrimaryKey(StudentLeaveKey key);

    int updateByPrimaryKeySelective(StudentLeave record);

    int updateByPrimaryKey(StudentLeave record);
}