package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolDept;
import com.tianyuan.WisdomTeacherServer.bean.SchoolSubject;

import java.util.List;

public interface DeptService {
    //查询部门
    SchoolDept searchDept(Integer id);

    //添加部门
    public boolean insertDept(SchoolDept schoolDept);

    //修改部门
    public boolean updateDept(SchoolDept schoolDept);

    //删除部门
    public boolean deleteDept(Integer id);

    List<SchoolDept> findAll(String id);

    Integer countItem();

}
