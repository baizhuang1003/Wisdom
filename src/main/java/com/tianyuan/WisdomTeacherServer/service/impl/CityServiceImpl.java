package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.RegionCity;
import com.tianyuan.WisdomTeacherServer.mapper.RegionCityMapper;
import com.tianyuan.WisdomTeacherServer.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private RegionCityMapper regionCityMapper;

    /**
     * 通过省份ID查询下属的所有城市
     * @param province 省份ID
     * @return 下属所有城市
     */
    @Override
    public List<RegionCity> selectByProvince(String province) {
        if (!"".equals(province)) {
            List<RegionCity> regionCityList = regionCityMapper.selectByProvince(province);
            return regionCityList;
        } else {
            return null;
        }
    }
}
