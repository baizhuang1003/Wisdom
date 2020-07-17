package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolDorm;

import java.util.List;

public interface DormService {
    SchoolDorm searchSchoolDorm(Integer id);
    boolean insertDorm(SchoolDorm schoolDorm);
    boolean updateDorm(SchoolDorm schoolDorm);
    boolean deleteDorm(Integer id);
    List<SchoolDorm> findAll();
    Integer countItem();
}
