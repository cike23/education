package com.attech.core.exception;

/**
 * Desc: 基础异常类
 * Author: Aaron
 * Time: 2018/7/10 23:43.
 * Version: v1.0
 *
 * 基础异常类都继承自运行时异常类(RunntimeException)，尽可能把受检异常转化为非受检异常，更好的面向接口编程，提高代码的扩展性、稳定性。
 *
 * BaseException：添加了一个错误编码，其它自定义的异常应当继承该类。
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
