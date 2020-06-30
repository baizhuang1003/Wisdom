package com.tianyuan.WisdomTeacherServer.service;

import java.util.List;

public interface ProvinceService {
    List<RegionProvince> findAll();
    Integer countItem();
}
