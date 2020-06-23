package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;

public class AttendanceWeeekTotal implements Serializable {
    private Integer teacherid;

    private Integer type;

    private String teachername;

    private Integer deptid;

    private Integer attenyear;

    private String code;

    private Integer attenmon;

    private Integer weeknum;

    private Integer normalnum;

    private Integer latenum;

    private Integer awaynum;

    private Integer lessnum;

    private static final long serialVersionUID = 1L;

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getAttenyear() {
        return attenyear;
    }

    public void setAttenyear(Integer attenyear) {
        this.attenyear = attenyear;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getAttenmon() {
        return attenmon;
    }

    public void setAttenmon(Integer attenmon) {
        this.attenmon = attenmon;
    }

    public Integer getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(Integer weeknum) {
        this.weeknum = weeknum;
    }

    public Integer getNormalnum() {
        return normalnum;
    }

    public void setNormalnum(Integer normalnum) {
        this.normalnum = normalnum;
    }

    public Integer getLatenum() {
        return latenum;
    }

    public void setLatenum(Integer latenum) {
        this.latenum = latenum;
    }

    public Integer getAwaynum() {
        return awaynum;
    }

    public void setAwaynum(Integer awaynum) {
        this.awaynum = awaynum;
    }

    public Integer getLessnum() {
        return lessnum;
    }

    public void setLessnum(Integer lessnum) {
        this.lessnum = lessnum;
    }
}