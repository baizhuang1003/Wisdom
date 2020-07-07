package com.tianyuan.WisdomTeacherServer.controller;

import com.github.pagehelper.PageHelper;
import com.tianyuan.WisdomTeacherServer.bean.SchoolJob;
import com.tianyuan.WisdomTeacherServer.bean.SchoolSubject;
import com.tianyuan.WisdomTeacherServer.service.SubjectService;
import com.tianyuan.WisdomTeacherServer.vo.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping(value = "/searchsubject",method = RequestMethod.GET)
    public SchoolSubject seach(){
        SchoolSubject schoolSubject = subjectService.serchSubject();
        return schoolSubject;
    }

    @RequestMapping(value ="/insertsubject",method = RequestMethod.POST)
    public boolean insert(SchoolSubject schoolSubject){
        boolean b = subjectService.insertSubject(schoolSubject);
        return b;
    }

    @RequestMapping(value ="/updatesubject",method = RequestMethod.POST)
    public boolean edit(SchoolSubject schoolSubject){
        boolean b = subjectService.updateSubject(schoolSubject);
        return b;
    }

    @RequestMapping(value ="/deletesubject",method = RequestMethod.POST)
    public boolean delete(Integer id){
        boolean b = subjectService.deleteSubject(id);
        return b;
    }

    @RequestMapping(value = "/subjectList/{currentPage}/{pageSize}",method = RequestMethod.GET)
    public PageBean<SchoolSubject> searchsubject(@PathVariable("currentPage") String currentPage, @PathVariable("pageSize") String pageSize){
        PageHelper.startPage(Integer.parseInt(currentPage), Integer.parseInt(pageSize));
        List<SchoolSubject> allItems = subjectService.findAll();
        int countNums = subjectService.countItem();
        PageBean<SchoolSubject> pageData = new PageBean<>(Integer.parseInt(currentPage), Integer.parseInt(pageSize), countNums);
        pageData.setItems(allItems);
        return pageData;
    }

}
