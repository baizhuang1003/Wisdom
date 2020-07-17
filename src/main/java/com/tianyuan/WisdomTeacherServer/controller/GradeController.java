package com.tianyuan.WisdomTeacherServer.controller;

import com.github.pagehelper.PageHelper;
import com.tianyuan.WisdomTeacherServer.bean.SchoolFloor;
import com.tianyuan.WisdomTeacherServer.bean.SchoolGrade;
import com.tianyuan.WisdomTeacherServer.service.GradeService;
import com.tianyuan.WisdomTeacherServer.vo.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @RequestMapping(value = "/grades/{id}",method = RequestMethod.GET)
    public SchoolGrade seach(String id){
        SchoolGrade schoolGrade = gradeService.searchGrade(Integer.parseInt(id));
        return schoolGrade;
    }

    @RequestMapping(value ="/insertgrade",method = RequestMethod.PUT)
    public boolean insert(SchoolGrade SchoolGrade){
        boolean b = gradeService.insertGrade(SchoolGrade);
        return b;
    }

    @RequestMapping(value ="/updategrade",method = RequestMethod.POST)
    public boolean edit(SchoolGrade schoolGrade){
        boolean b = gradeService.updateGrade(schoolGrade);
        return b;
    }

    @RequestMapping(value ="/deletegrade",method = RequestMethod.DELETE)
    public boolean delete(Integer id){
        boolean b = gradeService.deleteGrade(id);
        return b;
    }

    @RequestMapping(value = "/gradeList/{currentPage}/{pageSize}",method = RequestMethod.GET)
    public PageBean<SchoolGrade> searchgrade(@PathVariable("currentPage") String currentPage, @PathVariable("pageSize") String pageSize){
        PageHelper.startPage(Integer.parseInt(currentPage), Integer.parseInt(pageSize));
        List<SchoolGrade> allItems = gradeService.findAll();
        int countNums = gradeService.countItem();
        PageBean<SchoolGrade> pageData = new PageBean<>(Integer.parseInt(currentPage), Integer.parseInt(pageSize), countNums);
        pageData.setItems(allItems);
        return pageData;
    }
}
