package com.tianyuan.WisdomTeacherServer.Instantmapper;

import com.tianyuan.WisdomTeacherServer.Instantbean.GroupInfo;

public interface GroupInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GroupInfo record);

    int insertSelective(GroupInfo record);

    GroupInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GroupInfo record);

    int updateByPrimaryKey(GroupInfo record);
}