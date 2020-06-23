package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;

public class RoleLimits implements Serializable {
    private Integer id;

    private Integer roleid;

    private Integer limitsid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getLimitsid() {
        return limitsid;
    }

    public void setLimitsid(Integer limitsid) {
        this.limitsid = limitsid;
    }
}