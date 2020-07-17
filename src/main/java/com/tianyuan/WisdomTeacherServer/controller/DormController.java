package com.tianyuan.WisdomTeacherServer.controller;

import com.github.pagehelper.PageHelper;
import com.tianyuan.WisdomTeacherServer.bean.SchoolDorm;
import com.tianyuan.WisdomTeacherServer.bean.SchoolFloor;
import com.tianyuan.WisdomTeacherServer.service.DormService;
import com.tianyuan.WisdomTeacherServer.vo.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DormController {
    @Autowired
    private DormService dormService;

    @RequestMapping(value = "/dorms/{id}",method = RequestMethod.GET)
    public SchoolDorm seach(@PathVariable("id") String id){
        SchoolDorm schoolDorm = dormService.searchSchoolDorm(Integer.parseInt(id));
        return schoolDorm;
    }

    @RequestMapping(value ="/insertdorm",method = RequestMethod.PUT)
    public boolean insert(SchoolDorm schoolDorm){
        boolean b = dormService.insertDorm(schoolDorm);
        return b;
    }

    @RequestMapping(value ="/updatedorm",method = RequestMethod.POST)
    public boolean edit(SchoolDorm schoolDorm){
        boolean b = dormService.updateDorm(schoolDorm);
        return b;
    }

    @RequestMapping(value ="/deletedorm",method = RequestMethod.DELETE)
    public boolean delete(Integer id){
        boolean b = dormService.deleteDorm(id);
        return b;
    }

    @RequestMapping(value = "/dormList/{currentPage}/{pageSize}",method = RequestMethod.GET)
    public PageBean<SchoolDorm> searchfloor(@PathVariable("currentPage") String currentPage, @PathVariable("pageSize") String pageSize){
        PageHelper.startPage(Integer.parseInt(currentPage), Integer.parseInt(pageSize));
        List<SchoolDorm> allItems = dormService.findAll();
        int countNums = dormService.countItem();
        PageBean<SchoolDorm> pageData = new PageBean<>(Integer.parseInt(currentPage), Integer.parseInt(pageSize), countNums);
        pageData.setItems(allItems);
        return pageData;
    }
}
