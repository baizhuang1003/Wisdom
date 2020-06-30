package com.tianyuan.WisdomTeacherServer.Instantmapper;

import com.tianyuan.WisdomTeacherServer.Instantbean.UserGroup;

public interface UserGroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserGroup record);

    int insertSelective(UserGroup record);

    UserGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserGroup record);

    int updateByPrimaryKey(UserGroup record);
}