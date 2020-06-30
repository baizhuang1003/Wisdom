package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private RegionCityMapper regionCityMapper;


    public List<RegionCity> findAll() {
        List<RegionCity> all = regionCityMapper.findAll();
        return all;
    }

    public Integer countItem() {
        Integer countItem = regionCityMapper.countItem();
        return countItem;
    }
}
