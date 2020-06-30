package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.RegionProvince;

public interface RegionProvinceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegionProvince record);

    int insertSelective(RegionProvince record);

    RegionProvince selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegionProvince record);

    int updateByPrimaryKey(RegionProvince record);
}