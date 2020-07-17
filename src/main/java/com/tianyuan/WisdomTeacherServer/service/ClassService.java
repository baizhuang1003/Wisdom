package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolClass;
import com.tianyuan.WisdomTeacherServer.bean.SchoolSubject;

import java.util.List;

public interface ClassService {
    SchoolClass searchClass(Integer id);
    SchoolClass searchClassByschoolid(String schoolid,String classid);
    boolean insertClass(SchoolClass schoolClass);
    boolean updateClass(SchoolClass schoolClass);
    boolean deleteClass(Integer id);
    List<SchoolClass> findAll(String gradeid);
    Integer countItem();

}
