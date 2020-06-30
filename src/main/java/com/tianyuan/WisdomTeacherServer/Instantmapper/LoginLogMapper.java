package com.tianyuan.WisdomTeacherServer.Instantmapper;

import com.tianyuan.WisdomTeacherServer.Instantbean.LoginLog;

public interface LoginLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LoginLog record);

    int insertSelective(LoginLog record);

    LoginLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoginLog record);

    int updateByPrimaryKey(LoginLog record);
}