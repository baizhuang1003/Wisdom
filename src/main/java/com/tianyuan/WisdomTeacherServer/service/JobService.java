package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolJob;
import com.tianyuan.WisdomTeacherServer.bean.SchoolSubject;

import java.util.List;

public interface JobService {
    SchoolJob searchJob();
    public boolean insertJob(SchoolJob schoolJob);
    public boolean updateJob(SchoolJob schoolJob);
    public boolean deleteJob(Integer id);
    List<SchoolJob> findAll();
    Integer countItem();
}
