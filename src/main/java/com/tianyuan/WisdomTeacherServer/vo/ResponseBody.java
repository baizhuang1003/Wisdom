package com.tianyuan.WisdomTeacherServer.vo;

import com.alibaba.fastjson.JSONObject;

public class ResponseBody {

    private String code;

    private String message;

    private Object result;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public ResponseBody(String code, String message, Object result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public String getJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", code);
        jsonObject.put("message", message);
        jsonObject.put("result", result);
        return jsonObject.toJSONString();
    }
}
