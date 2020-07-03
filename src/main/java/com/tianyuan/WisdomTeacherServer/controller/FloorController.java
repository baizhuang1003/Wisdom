package com.tianyuan.WisdomTeacherServer.controller;

import com.github.pagehelper.PageHelper;
import com.tianyuan.WisdomTeacherServer.bean.SchoolFloor;
import com.tianyuan.WisdomTeacherServer.service.FloorService;
import com.tianyuan.WisdomTeacherServer.vo.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FloorController {
    @Autowired
    private FloorService floorService;
    @RequestMapping(value = "/searchfloor",method = RequestMethod.GET)
    public SchoolFloor seach(){
        SchoolFloor schoolFloor = floorService.searchFloor();
        return schoolFloor;
    }

    @RequestMapping(value ="/insertfloor",method = RequestMethod.POST)
    public boolean insert(SchoolFloor schoolFloor){
        boolean b = floorService.insertFloor(schoolFloor);
        return b;
    }

    @RequestMapping(value ="/updatefloor",method = RequestMethod.POST)
    public boolean edit(SchoolFloor schoolFloor){
        boolean b = floorService.updateFloor(schoolFloor);
        return b;
    }

    @RequestMapping(value ="/deletefloor",method = RequestMethod.DELETE)
    public boolean delete(Integer id){
        boolean b = floorService.deleteFloor(id);
        return b;
    }

    @RequestMapping(value = "/floorList/{currentPage}/{pageSize}",method = RequestMethod.GET)
    public PageBean<SchoolFloor> searchfloor(@PathVariable("currentPage") String currentPage, @PathVariable("pageSize") String pageSize){
        PageHelper.startPage(Integer.parseInt(currentPage), Integer.parseInt(pageSize));
        List<SchoolFloor> allItems = floorService.findAll();
        int countNums = floorService.countItem();
        PageBean<SchoolFloor> pageData = new PageBean<>(Integer.parseInt(currentPage), Integer.parseInt(pageSize), countNums);
        pageData.setItems(allItems);
        return pageData;
    }
}
