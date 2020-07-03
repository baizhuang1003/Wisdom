package com.tianyuan.WisdomTeacherServer.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tianyuan.WisdomTeacherServer.bean.SchoolTerm;
import com.tianyuan.WisdomTeacherServer.service.TermService;
import com.tianyuan.WisdomTeacherServer.vo.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TermController {
    @Autowired
    private TermService termService;

    @RequestMapping(value ="/searchterms",method = RequestMethod.GET)
    public ResponseBody searchterm(){
        PageHelper.startPage(1, 10);
        List<SchoolTerm> schoolTerms = termService.findAll();
        PageInfo pageInfo = new PageInfo(schoolTerms);
        if (schoolTerms != null) {
            return new ResponseBody("200", "查询成功", pageInfo);
        } else {
            return new ResponseBody("500", "查询失败", null);
        }
    }


    @RequestMapping(value ="/insertterm",method = RequestMethod.POST)
    public boolean insert(SchoolTerm schoolTerm){
        boolean b = termService.insertTerm(schoolTerm);
        return b;
    }

    @RequestMapping(value ="/updateterm",method = RequestMethod.POST)
    public boolean edit(SchoolTerm schoolTerm){
        boolean b = termService.updateTerm(schoolTerm);
        return b;
    }

    @RequestMapping(value ="/deleteterm",method = RequestMethod.DELETE)
    public boolean delete(Integer id){
        boolean b = termService.deleteTerm(id);
        return b;
    }

}
