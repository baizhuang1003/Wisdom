package com.tianyuan.WisdomTeacherServer.Instantbean;

import java.io.Serializable;
import java.util.Date;

public class UserBuddy implements Serializable {
    private Integer id;

    private Integer userid;

    private Integer buddyid;

    private Date createtime;

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

    public Integer getBuddyid() {
        return buddyid;
    }

    public void setBuddyid(Integer buddyid) {
        this.buddyid = buddyid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}