package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolAttendanceRecord;
import com.tianyuan.WisdomTeacherServer.bean.SchoolAttendanceRecordKey;

public interface SchoolAttendanceRecordMapper {
    int deleteByPrimaryKey(SchoolAttendanceRecordKey key);

    int insert(SchoolAttendanceRecord record);

    int insertSelective(SchoolAttendanceRecord record);

    SchoolAttendanceRecord selectByPrimaryKey(SchoolAttendanceRecordKey key);

    int updateByPrimaryKeySelective(SchoolAttendanceRecord record);

    int updateByPrimaryKey(SchoolAttendanceRecord record);
}