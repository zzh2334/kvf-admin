package com.kalvin.kvf.exception;

/**
 * 自定义异常类
 */
public class LayOAException extends RuntimeException {

    private static final long serialVersionUID = 3844100562400725986L;
    private Integer errorCode;
    private String msg;

    public LayOAException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public LayOAException(int errorCode, String msg) {
        super(msg);
        this.errorCode = errorCode;
        this.msg = msg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
