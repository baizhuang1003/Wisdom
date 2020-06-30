package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolTerm;
import com.tianyuan.WisdomTeacherServer.bean.SchoolTermKey;

import java.util.List;

public interface TermService {
    SchoolTerm serchTerm();
    public boolean insertTerm(SchoolTerm schoolTerm);
    public boolean updateTerm(SchoolTerm schoolTerm);
    public boolean deleteTerm(SchoolTermKey key);
    List<SchoolTerm> findAll();
    Integer countItem();
}
