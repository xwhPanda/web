package com.xwh.demo.utils;


import org.springframework.util.StringUtils;

public class Result<T> {
    public static final int OK = 0;
    public static final int ERROR = -1;

    private Integer code;
    private String msg;
    private T data;
    private ReturnEnum returnNum;

    public Result(){
        returnNum = ReturnEnum.SUCCESS;
    }

    public Result(ReturnEnum returnNum){
        this.returnNum = returnNum;
    }

    public Result(ReturnEnum returnNum, String msg){
        this.returnNum = returnNum;
        this.msg = msg;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        if (!StringUtils.isEmpty(msg)){
            return msg;
        } else if (returnNum != null){
            return returnNum.getMessage();
        }
        return "";
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ReturnEnum getReturnNum() {
        return returnNum;
    }

    public void setReturnNum(ReturnEnum returnNum) {
        this.returnNum = returnNum;
    }
}
