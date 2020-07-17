package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.RegionCity;

import java.util.List;

public interface CityService {
    List<RegionCity> selectByProvince(String province);
}
