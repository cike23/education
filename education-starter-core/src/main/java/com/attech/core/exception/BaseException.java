package com.attech.core.exception;

/**
 * Desc: 基础异常类
 * Author: Aaron
 * Time: 2018/7/10 23:43.
 * Version: v1.0
 */
public class BaseException extends RuntimeException {

    private static final long serialVersionUID = -997101946070796354L;

    /**
     * 错误编码
     */
    protected String code;

    public BaseException() {

    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, String code) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
