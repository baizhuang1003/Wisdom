package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.RegionZone;

import java.util.List;

public interface ZoneService {

    List<RegionZone> searchByZone(String province ,String city);
}
