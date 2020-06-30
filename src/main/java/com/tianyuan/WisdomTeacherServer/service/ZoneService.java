package com.tianyuan.WisdomTeacherServer.service;

import java.util.List;

public interface ZoneService {

    List<RegionZone> findAll();
    Integer countItem();
}
