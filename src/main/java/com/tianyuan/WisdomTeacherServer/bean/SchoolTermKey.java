package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;

public class SchoolTermKey implements Serializable {
    private Integer id;

    private Integer schoolid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
    }
}