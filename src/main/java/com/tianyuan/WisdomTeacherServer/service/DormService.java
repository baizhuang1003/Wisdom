package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolDorm;

import java.util.List;

public interface DormService {
    SchoolDorm searchSchoolDorm(Integer id);
    public boolean insertDorm(SchoolDorm schoolDorm);
    public boolean updateDorm(SchoolDorm schoolDorm);
    public boolean deleteDorm(Integer id);
    List<SchoolDorm> findAll();
    Integer countItem();
}
