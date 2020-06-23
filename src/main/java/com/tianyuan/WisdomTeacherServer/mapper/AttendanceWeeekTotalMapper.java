package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.AttendanceWeeekTotal;

public interface AttendanceWeeekTotalMapper {
    int deleteByPrimaryKey(Integer teacherid);

    int insert(AttendanceWeeekTotal record);

    int insertSelective(AttendanceWeeekTotal record);

    AttendanceWeeekTotal selectByPrimaryKey(Integer teacherid);

    int updateByPrimaryKeySelective(AttendanceWeeekTotal record);

    int updateByPrimaryKey(AttendanceWeeekTotal record);
}