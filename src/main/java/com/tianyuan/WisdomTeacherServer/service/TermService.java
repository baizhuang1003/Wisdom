package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolClass;
import com.tianyuan.WisdomTeacherServer.bean.SchoolTerm;

import java.util.List;

public interface TermService {
    SchoolTerm searchTerm(Integer id);
    boolean insertTerm(SchoolTerm schoolTerm);
    boolean updateTerm(SchoolTerm schoolTerm);
    boolean deleteTerm(Integer id);
    List<SchoolTerm> findAll();
    Integer countItem();
}
