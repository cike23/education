package com.attech.core.exception;

/**
 * Desc: Service层异常
 * Author: Aaron
 * Time: 2018/7/10 23:46.
 * Version: v1.0
 * <p>
 * 继承BaseException，Service层往Controller抛出的异常
 */
public class ServiceException extends BaseException {

    private static final long serialVersionUID = 6058294324031642376L;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String code, String message) {
        super(code, message);
    }

}
