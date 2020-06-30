package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolClass;
import com.tianyuan.WisdomTeacherServer.bean.SchoolSubject;

import java.util.List;

public interface ClassService {
    SchoolClass searchClass();
    public boolean insertClass(SchoolClass schoolClass);
    public boolean updateClass(SchoolClass schoolClass);
    public boolean deleteClass(Integer id);
    List<SchoolClass> findAll();
    Integer countItem();

}
