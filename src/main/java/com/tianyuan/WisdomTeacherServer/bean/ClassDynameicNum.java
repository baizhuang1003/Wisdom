package com.tianyuan.WisdomTeacherServer.bean;

import java.io.Serializable;

public class ClassDynameicNum implements Serializable {
    private Integer id;

    private Integer dynameicid;

    private Integer commentnum;

    private Integer hitsnum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDynameicid() {
        return dynameicid;
    }

    public void setDynameicid(Integer dynameicid) {
        this.dynameicid = dynameicid;
    }

    public Integer getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(Integer commentnum) {
        this.commentnum = commentnum;
    }

    public Integer getHitsnum() {
        return hitsnum;
    }

    public void setHitsnum(Integer hitsnum) {
        this.hitsnum = hitsnum;
    }
}