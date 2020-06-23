package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;
import java.util.Date;

public class TeacherInfo implements Serializable {
    private Integer id;

    private String qihangId;

    private String name;

    private String nick;

    private String mobile;

    private String email;

    private String avatar;

    private Integer gender;

    private String username;

    private String password;

    private String code;

    private String idnumber;

    private String birthdate;

    private Date jobdate;

    private String workage;

    private String ethnic;

    private String political;

    private String regionid;

    private String region;

    private String address;

    private String qqcode;

    private String wechant;

    private String idface;

    private String idback;

    private String idtake;

    private String idcode;

    private Integer really;

    private Integer enable;

    private Date updatetime;

    private Integer createuid;

    private Date createtime;

    private Integer updateuid;

    private Boolean del;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQihangId() {
        return qihangId;
    }

    public void setQihangId(String qihangId) {
        this.qihangId = qihangId == null ? null : qihangId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate == null ? null : birthdate.trim();
    }

    public Date getJobdate() {
        return jobdate;
    }

    public void setJobdate(Date jobdate) {
        this.jobdate = jobdate;
    }

    public String getWorkage() {
        return workage;
    }

    public void setWorkage(String workage) {
        this.workage = workage == null ? null : workage.trim();
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic == null ? null : ethnic.trim();
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political == null ? null : political.trim();
    }

    public String getRegionid() {
        return regionid;
    }

    public void setRegionid(String regionid) {
        this.regionid = regionid == null ? null : regionid.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getQqcode() {
        return qqcode;
    }

    public void setQqcode(String qqcode) {
        this.qqcode = qqcode == null ? null : qqcode.trim();
    }

    public String getWechant() {
        return wechant;
    }

    public void setWechant(String wechant) {
        this.wechant = wechant == null ? null : wechant.trim();
    }

    public String getIdface() {
        return idface;
    }

    public void setIdface(String idface) {
        this.idface = idface == null ? null : idface.trim();
    }

    public String getIdback() {
        return idback;
    }

    public void setIdback(String idback) {
        this.idback = idback == null ? null : idback.trim();
    }

    public String getIdtake() {
        return idtake;
    }

    public void setIdtake(String idtake) {
        this.idtake = idtake == null ? null : idtake.trim();
    }

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode == null ? null : idcode.trim();
    }

    public Integer getReally() {
        return really;
    }

    public void setReally(Integer really) {
        this.really = really;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
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