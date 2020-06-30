package com.tianyuan.WisdomTeacherServer.Instantmapper;

import com.tianyuan.WisdomTeacherServer.Instantbean.UserBuddy;

public interface UserBuddyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserBuddy record);

    int insertSelective(UserBuddy record);

    UserBuddy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserBuddy record);

    int updateByPrimaryKey(UserBuddy record);
}