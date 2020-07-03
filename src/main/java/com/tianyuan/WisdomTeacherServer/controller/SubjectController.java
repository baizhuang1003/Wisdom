package com.tianyuan.WisdomTeacherServer.controller;

import com.tianyuan.WisdomTeacherServer.bean.SchoolSubject;
import com.tianyuan.WisdomTeacherServer.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

}
