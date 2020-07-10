package com.tianyuan.WisdomTeacherServer.service;


import com.tianyuan.WisdomTeacherServer.bean.SchoolFloor;
import com.tianyuan.WisdomTeacherServer.bean.SchoolSubject;

import java.util.List;

public interface FloorService {
    SchoolFloor searchFloor(Integer id);
    public boolean insertFloor(SchoolFloor schoolFloor);
    public boolean updateFloor(SchoolFloor schoolFloor);
    public boolean deleteFloor(Integer id);
    List<SchoolFloor> findAll();
    Integer countItem();
}
