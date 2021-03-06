package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.RegionProvince;
import com.tianyuan.WisdomTeacherServer.mapper.RegionProvinceMapper;
import com.tianyuan.WisdomTeacherServer.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private RegionProvinceMapper regionProvinceMapper;


    @Override
    public List<RegionProvince> findAll() {
        List<RegionProvince> all = regionProvinceMapper.findAll();
        return all;
    }

}
