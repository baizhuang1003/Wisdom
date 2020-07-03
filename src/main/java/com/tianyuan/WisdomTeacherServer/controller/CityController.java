package com.tianyuan.WisdomTeacherServer.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tianyuan.WisdomTeacherServer.bean.RegionCity;
import com.tianyuan.WisdomTeacherServer.service.CityService;
import com.tianyuan.WisdomTeacherServer.vo.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/provinces/{province}/citys", method = RequestMethod.GET)
    public ResponseBody searchRegionCity(@PathVariable("province") String province) {
        List<RegionCity> regionCities = cityService.selectByProvince(province);
        if (regionCities != null) {
            return new ResponseBody("200", "查询成功", regionCities);
        } else {
            return new ResponseBody("500", "查询失败", null);
        }
    }

    /*@RequestMapping(value = "/provinces/{province}/citys", method = RequestMethod.GET)
    public ResponseBody searchRegionCity2(@PathVariable("province") String province) {
        PageHelper.startPage(1, 10);
        List<RegionCity> regionCities = cityService.selectByProvince(province);
        PageInfo pageInfo = new PageInfo(regionCities);
        if (regionCities != null) {
            return new ResponseBody("200", "查询成功", pageInfo);
        } else {
            return new ResponseBody("500", "查询失败", null);
        }
    }*/
}
