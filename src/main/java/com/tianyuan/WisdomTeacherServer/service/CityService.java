package com.tianyuan.WisdomTeacherServer.service;

import java.util.List;

public interface CityService {

    List<RegionCity> findAll();
    Integer countItem();
}
