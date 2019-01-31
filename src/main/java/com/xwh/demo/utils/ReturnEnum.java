package com.xwh.demo.utils;

public enum ReturnEnum {
    FAIL(0,"系统错误"),
    SUCCESS(1,"操作成功");

    private Integer code;
    private String message;

    ReturnEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
