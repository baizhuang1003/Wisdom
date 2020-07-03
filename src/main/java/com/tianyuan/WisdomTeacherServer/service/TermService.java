package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolTerm;

import java.util.List;

public interface TermService {
    public boolean insertTerm(SchoolTerm schoolTerm);
    public boolean updateTerm(SchoolTerm schoolTerm);
    public boolean deleteTerm(Integer id);
    List<SchoolTerm> findAll();
    Integer countItem();
}
