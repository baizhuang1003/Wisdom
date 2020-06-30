package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolGrade;
import com.tianyuan.WisdomTeacherServer.bean.SchoolSubject;

import java.util.List;

public interface GradeService {
    SchoolGrade searchGrade();
    public boolean insertGrade(SchoolGrade schoolGrade);
    public boolean updateGrade(SchoolGrade schoolGrade);
    public boolean deleteGrade(Integer id);
    List<SchoolGrade> findAll();
    Integer countItem();
}
