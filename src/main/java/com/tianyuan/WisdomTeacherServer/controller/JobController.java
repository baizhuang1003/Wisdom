package com.tianyuan.WisdomTeacherServer.controller;

import com.github.pagehelper.PageHelper;
import com.tianyuan.WisdomTeacherServer.bean.SchoolClass;
import com.tianyuan.WisdomTeacherServer.bean.SchoolJob;
import com.tianyuan.WisdomTeacherServer.service.JobService;
import com.tianyuan.WisdomTeacherServer.vo.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    private JobService jobService;

    @RequestMapping(value = "/jobs/{id}",method = RequestMethod.GET)
    public SchoolJob seach(String id){
        SchoolJob schoolJob = jobService.searchJob(Integer.parseInt(id));
        return schoolJob;
    }

    @RequestMapping(value ="/insertjob",method = RequestMethod.PUT)
    public boolean insert(SchoolJob schoolJob) {
        boolean b= jobService.insertJob(schoolJob);
        return b;
    }

    @RequestMapping(value ="/editjob",method = RequestMethod.POST)
    public boolean edit(SchoolJob schoolJob){
        boolean b = jobService.updateJob(schoolJob);
        return b;
    }

    @RequestMapping(value ="/deletejob",method = RequestMethod.POST)
    public  boolean delete(Integer id) {
        boolean b = jobService.deleteJob(id);
        return b ;
    }

    @RequestMapping(value = "/jobList/{currentPage}/{pageSize}",method = RequestMethod.GET)
    public PageBean<SchoolJob> searchjob(@PathVariable("currentPage") String currentPage, @PathVariable("pageSize") String pageSize){
        PageHelper.startPage(Integer.parseInt(currentPage), Integer.parseInt(pageSize));
        List<SchoolJob> allItems = jobService.findAll();
        int countNums = jobService.countItem();
        PageBean<SchoolJob> pageData = new PageBean<>(Integer.parseInt(currentPage), Integer.parseInt(pageSize), countNums);
        pageData.setItems(allItems);
        return pageData;
    }
}
