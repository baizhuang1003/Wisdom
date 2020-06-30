package com.tianyuan.WisdomTeacherServer.controller;

//import com.tianyuan.WisdomTeacherServer.bean.RegionCity;
import com.tianyuan.WisdomTeacherServer.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;

//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public List<RegionCity> dropList(){
//        List<RegionCity> allItems = cityService.findAll();
//        int countNums = cityService.countItem();
//        return allItems;
//    }
}
