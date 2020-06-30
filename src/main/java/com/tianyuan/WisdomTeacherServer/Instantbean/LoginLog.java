package com.tianyuan.WisdomTeacherServer.Instantbean;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable {
    private Integer id;

    private Integer userid;

    private Date createtime;

    private String loginip;

    private Integer logintype;

    private String loginaccount;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    public Integer getLogintype() {
        return logintype;
    }

    public void setLogintype(Integer logintype) {
        this.logintype = logintype;
    }

    public String getLoginaccount() {
        return loginaccount;
    }

    public void setLoginaccount(String loginaccount) {
        this.loginaccount = loginaccount == null ? null : loginaccount.trim();
    }
}