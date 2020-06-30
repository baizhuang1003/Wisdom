package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;
import java.util.Date;

public class AttendanceMonthTotal implements Serializable {
    private Integer id;

    private Integer type;

    private Integer teacherId;

    private String teacherName;

    private String code;

    private Integer attenYear;

    private Integer attenMon;

    private Integer normalNum;

    private Integer lateNum;

    private Integer awayNum;

    private Integer lessNum;

    private Integer deptId;

    private String remark;

    private Date updateTime;

    private Integer createUid;

    private Date createTime;

    private Integer updateUid;

    private Integer del;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getAttenYear() {
        return attenYear;
    }

    public void setAttenYear(Integer attenYear) {
        this.attenYear = attenYear;
    }

    public Integer getAttenMon() {
        return attenMon;
    }

    public void setAttenMon(Integer attenMon) {
        this.attenMon = attenMon;
    }

    public Integer getNormalNum() {
        return normalNum;
    }

    public void setNormalNum(Integer normalNum) {
        this.normalNum = normalNum;
    }

    public Integer getLateNum() {
        return lateNum;
    }

    public void setLateNum(Integer lateNum) {
        this.lateNum = lateNum;
    }

    public Integer getAwayNum() {
        return awayNum;
    }

    public void setAwayNum(Integer awayNum) {
        this.awayNum = awayNum;
    }

    public Integer getLessNum() {
        return lessNum;
    }

    public void setLessNum(Integer lessNum) {
        this.lessNum = lessNum;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCreateUid() {
        return createUid;
    }

    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateUid() {
        return updateUid;
    }

    public void setUpdateUid(Integer updateUid) {
        this.updateUid = updateUid;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }
}