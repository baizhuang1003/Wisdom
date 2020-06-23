package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;

public class StudentGuardionKey implements Serializable {
    private Integer schoolid;

    private Integer guardionid;

    private Integer studentid;

    private static final long serialVersionUID = 1L;

    public Integer getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
    }

    public Integer getGuardionid() {
        return guardionid;
    }

    public void setGuardionid(Integer guardionid) {
        this.guardionid = guardionid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }
}