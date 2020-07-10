package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.SchoolClass;
import com.tianyuan.WisdomTeacherServer.bean.SchoolFloor;
import com.tianyuan.WisdomTeacherServer.mapper.SchoolFloorMapper;
import com.tianyuan.WisdomTeacherServer.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FloorServiceImpl implements FloorService {

    @Autowired
    private SchoolFloorMapper schoolFloorMapper;



    @Override
    public SchoolFloor searchFloor(Integer id) {
        if (!"".equals(id)){
            SchoolFloor schoolFloor = schoolFloorMapper.selectByPrimaryKey(id);
            return schoolFloor;
        }else{
            return null;
        }
    }

    public boolean insertFloor(SchoolFloor schoolFloor) {
        int count = schoolFloorMapper.insertSelective(schoolFloor);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateFloor(SchoolFloor schoolFloor) {
        int count =schoolFloorMapper.updateByPrimaryKeySelective(schoolFloor);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteFloor(Integer id) {
        int count = schoolFloorMapper.deleteByPrimaryKey(id);
        if (count > 0 ){
            return  true;
        }else {
            return false;
        }
    }

    @Override
    public List<SchoolFloor> findAll() {
        List<SchoolFloor> schoolClasses = schoolFloorMapper.findAll();
        return schoolClasses;
    }

    @Override
    public Integer countItem() {
        int countItem = schoolFloorMapper.countItem();
        return countItem;
    }
}
