package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolGrade;

import java.util.List;

public interface GradeService {
    SchoolGrade searchGrade(Integer id);
    public boolean insertGrade(SchoolGrade schoolGrade);
    public boolean updateGrade(SchoolGrade schoolGrade);
    public boolean deleteGrade(Integer id);
    List<SchoolGrade> findAll();
    Integer countItem();
}
