package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.RegionZone;

import java.util.List;

public interface RegionZoneMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegionZone record);

    int insertSelective(RegionZone record);

    RegionZone selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegionZone record);

    int updateByPrimaryKey(RegionZone record);

    List<RegionZone> searchByZone(String province, String city);

}