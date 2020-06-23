package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;

public class CourseNum implements Serializable {
    private Integer id;

    private Integer courseid;

    private Integer collectnum;

    private Integer hitsnum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getCollectnum() {
        return collectnum;
    }

    public void setCollectnum(Integer collectnum) {
        this.collectnum = collectnum;
    }

    public Integer getHitsnum() {
        return hitsnum;
    }

    public void setHitsnum(Integer hitsnum) {
        this.hitsnum = hitsnum;
    }
}