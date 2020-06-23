package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;
import java.util.Date;

public class StudentLeave extends StudentLeaveKey implements Serializable {
    private Integer guardionid;

    private String guardionname;

    private String guardionmobile;

    private Integer studentid;

    private String studentname;

    private Integer teacherid;

    private String teachername;

    private Integer typeid;

    private String typename;

    private Date starttime;

    private Date endtime;

    private Integer status;

    private Date updatetime;

    private Integer createuid;

    private Date createtime;

    private Integer updateuid;

    private Boolean del;

    private static final long serialVersionUID = 1L;

    public Integer getGuardionid() {
        return guardionid;
    }

    public void setGuardionid(Integer guardionid) {
        this.guardionid = guardionid;
    }

    public String getGuardionname() {
        return guardionname;
    }

    public void setGuardionname(String guardionname) {
        this.guardionname = guardionname == null ? null : guardionname.trim();
    }

    public String getGuardionmobile() {
        return guardionmobile;
    }

    public void setGuardionmobile(String guardionmobile) {
        this.guardionmobile = guardionmobile == null ? null : guardionmobile.trim();
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getCreateuid() {
        return createuid;
    }

    public void setCreateuid(Integer createuid) {
        this.createuid = createuid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getUpdateuid() {
        return updateuid;
    }

    public void setUpdateuid(Integer updateuid) {
        this.updateuid = updateuid;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }
}