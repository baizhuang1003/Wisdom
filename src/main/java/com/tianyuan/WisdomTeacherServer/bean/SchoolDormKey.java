package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;

public class SchoolDormKey implements Serializable {
    private Integer id;

    private Integer schoolid;

    private Integer floorid;

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

    public Integer getFloorid() {
        return floorid;
    }

    public void setFloorid(Integer floorid) {
        this.floorid = floorid;
    }
}