package com.tianyuan.WisdomTeacherServer.controller;


import com.github.pagehelper.PageHelper;
import com.tianyuan.WisdomTeacherServer.bean.SchoolClass;
import com.tianyuan.WisdomTeacherServer.bean.SchoolDept;
import com.tianyuan.WisdomTeacherServer.service.DeptService;
import com.tianyuan.WisdomTeacherServer.vo.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/schools/{schoolid}/depts/{id}",method = RequestMethod.GET)
    public SchoolDept seach(@PathVariable("schoolid") String schoolid, @PathVariable("id") String id){
        SchoolDept schoolDept = deptService.searchDeptBySchoolid(schoolid,id);
        return schoolDept;
    }

    @RequestMapping(value ="/insertdept",method = RequestMethod.PUT)
    public boolean insert(SchoolDept schoolDept) {
         boolean b= deptService.insertDept(schoolDept);
        return b;
    }

    @RequestMapping(value ="/editdept",method = RequestMethod.POST)
    public boolean edit(SchoolDept schoolDept){
        boolean b = deptService.updateDept(schoolDept);
        return b;
    }

    @RequestMapping(value ="/deletedept",method = RequestMethod.DELETE)
    public  boolean delete(Integer id) {
        boolean b = deptService.deleteDept(id);
        return b ;
    }

    @RequestMapping(value = "/deptList/{currentPage}/{pageSize}/{id}",method = RequestMethod.GET)
    public PageBean<SchoolDept> searchdept(@PathVariable("currentPage") String currentPage, @PathVariable("pageSize") String pageSize, @PathVariable("id") String id){
        System.out.println(id);
        PageHelper.startPage(Integer.parseInt(currentPage), Integer.parseInt(pageSize));
        List<SchoolDept> allItems = deptService.findAll(id);
        int countNums = deptService.countItem();
        PageBean<SchoolDept> pageData = new PageBean<>(Integer.parseInt(currentPage), Integer.parseInt(pageSize), countNums);
        pageData.setItems(allItems);
        return pageData;
    }
}
