package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolSubject;

import java.util.List;

public interface SubjectService {
    SchoolSubject serchSubject();
    boolean insertSubject(SchoolSubject schoolSubject);
    boolean updateSubject(SchoolSubject schoolSubject);
    boolean deleteSubject(Integer id);
    List<SchoolSubject> findAll();
    Integer countItem();
}
