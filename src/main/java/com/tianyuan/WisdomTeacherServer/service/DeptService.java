package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolDept;

import java.util.List;

public interface DeptService {
    //查询部门
    SchoolDept searchDept(Integer id);

    SchoolDept searchDeptBySchoolid(String schoolid ,String id);

    //添加部门
    boolean insertDept(SchoolDept schoolDept);

    //修改部门
    boolean updateDept(SchoolDept schoolDept);

    //删除部门
    boolean deleteDept(Integer id);

    List<SchoolDept> findAll(String id);

    Integer countItem();

}
