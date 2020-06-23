package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;

public class AttendanceMonthTotal implements Serializable {
    private Integer teacherid;

    private Integer type;

    private String teachername;

    private String code;

    private String attenyear;

    private String attenmon;

    private Integer normalnum;

    private Integer latenum;

    private Integer awaynum;

    private Integer lessnum;

    private Integer deptid;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getAttenyear() {
        return attenyear;
    }

    public void setAttenyear(String attenyear) {
        this.attenyear = attenyear == null ? null : attenyear.trim();
    }

    public String getAttenmon() {
        return attenmon;
    }

    public void setAttenmon(String attenmon) {
        this.attenmon = attenmon == null ? null : attenmon.trim();
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

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }
}