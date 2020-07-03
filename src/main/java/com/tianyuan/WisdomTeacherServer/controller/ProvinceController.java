package com.tianyuan.WisdomTeacherServer.controller;

import com.tianyuan.WisdomTeacherServer.bean.RegionCity;
import com.tianyuan.WisdomTeacherServer.bean.RegionProvince;
import com.tianyuan.WisdomTeacherServer.service.ProvinceService;
import com.tianyuan.WisdomTeacherServer.vo.ResponseBody;
import org.apache.commons.collections4.Get;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

    @RequestMapping(value = "/provinceList",method = RequestMethod.GET)
    public List<RegionProvince> list(){
        List<RegionProvince> allItems = provinceService.findAll();
        return allItems;
    }

    @RequestMapping(value = "/region/provinces", method = RequestMethod.GET)
    public ResponseBody searchRegionCity() {
        List<RegionProvince> regionProvinces = provinceService.findAll();
        if (regionProvinces != null) {
            return new ResponseBody("200", "查询成功", regionProvinces);
        } else {
            return new ResponseBody("500", "查询失败", null);
        }
    }
}
