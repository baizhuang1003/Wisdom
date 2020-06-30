package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.service.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZoneServiceImpl implements ZoneService {
    @Autowired
    private RegionZoneMapper regionZoneMapper;


    @Override
    public List<RegionZone> findAll() {
        List<RegionZone> all = regionZoneMapper.findAll();
        return all;
    }

    @Override
    public Integer countItem() {
        Integer countItem = regionZoneMapper.countItem();
        return countItem;
    }
}
