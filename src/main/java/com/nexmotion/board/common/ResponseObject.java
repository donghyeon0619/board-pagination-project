package com.nexmotion.board.common;

public class ResponseObject<T> {

    private String returnCode;
    private T data;

    public T getData() { return data; }

    public void setData() { this.data = data; }

    public String getReturnCode() { return returnCode; }

    public void setReturnCode() { this.returnCode = returnCode; }

}
