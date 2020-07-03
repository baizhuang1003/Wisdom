package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.RegionCity;

import java.util.List;

public interface RegionCityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegionCity record);

    int insertSelective(RegionCity record);

    RegionCity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegionCity record);

    int updateByPrimaryKey(RegionCity record);

    List<RegionCity> selectByProvince(String province);


}