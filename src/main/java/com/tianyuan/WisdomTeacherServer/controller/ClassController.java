package com.tianyuan.WisdomTeacherServer.controller;

import com.github.pagehelper.PageHelper;
import com.tianyuan.WisdomTeacherServer.bean.SchoolClass;
import com.tianyuan.WisdomTeacherServer.service.ClassService;
import com.tianyuan.WisdomTeacherServer.vo.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClassController {
    @Autowired
    private ClassService classService;

    @RequestMapping(value = "/searchclass",method = RequestMethod.GET)
    public SchoolClass seachSchoolClass(Integer id){
        SchoolClass schoolClass = classService.searchClass(id);
        if (!"".equals(schoolClass)){
            return schoolClass;
        }else{
            return null;
        }
    }

    @RequestMapping(value ="/insertclass",method = RequestMethod.POST)
    public boolean insert(@RequestBody SchoolClass schoolClass){
        boolean b = classService.insertClass(schoolClass);
        return b;
    }

    @RequestMapping(value ="/updateclass",method = RequestMethod.POST)
    public boolean edit(@RequestBody SchoolClass schoolClass){
        boolean b = classService.updateClass(schoolClass);
        return b;
    }

    @RequestMapping(value ="/deleteclass",method = RequestMethod.DELETE)
    public boolean delete(Integer id){
        boolean b = classService.deleteClass(id);
        return b;
    }

    @RequestMapping(value = "/classList/{currentPage}/{pageSize}/{gradeId}",method = RequestMethod.GET)
    public PageBean<SchoolClass> searchclass(@PathVariable("currentPage") String currentPage, @PathVariable("pageSize") String pageSize, @PathVariable("gradeId") String gradeId){
        System.out.println(gradeId);
        PageHelper.startPage(Integer.parseInt(currentPage), Integer.parseInt(pageSize));
        List<SchoolClass> allItems = classService.findAll(gradeId);
        int countNums = classService.countItem();
        PageBean<SchoolClass> pageData = new PageBean<>(Integer.parseInt(currentPage), Integer.parseInt(pageSize), countNums);
        pageData.setItems(allItems);
        return pageData;
    }


}
