package com.tianyuan.WisdomTeacherServer.controller;

import com.tianyuan.WisdomTeacherServer.bean.RegionCity;
import com.tianyuan.WisdomTeacherServer.bean.RegionZone;
import com.tianyuan.WisdomTeacherServer.service.ZoneService;
import com.tianyuan.WisdomTeacherServer.vo.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ZoneController {

    @Autowired
    private ZoneService zoneService;

    @RequestMapping(value = "/provinces/{province}/cities/{city}/zones", method = RequestMethod.GET)
    public ResponseBody searchRegionZone(@PathVariable("province") String province,@PathVariable("city") String city) {
        List<RegionZone> regionCities = zoneService.searchByZone(province,city);
        if (regionCities != null) {
            return new ResponseBody("200", "查询成功", regionCities);
        } else {
            return new ResponseBody("500", "查询失败", null);
        }
    }

}
