package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.RegionCity;
import com.tianyuan.WisdomTeacherServer.bean.RegionZone;
import com.tianyuan.WisdomTeacherServer.mapper.RegionZoneMapper;
import com.tianyuan.WisdomTeacherServer.service.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZoneServiceImpl implements ZoneService {
    @Autowired
    private RegionZoneMapper regionZoneMapper;

    /**
     * 通过省份ID 和城市ID 查询下属区县
     * @param province 省份ID
     * @param city  城市ID
     * @return
     */

    @Override
    public List<RegionZone> searchByZone(String province, String city) {
        if (!"".equals(province) && !"".equals(city)) {
            List<RegionZone> regionZoneList = regionZoneMapper.searchByZone(province, city);
            return regionZoneList;
        } else {
            return null;
        }
    }
}
