package com.attech.core.exception;

/**
 * 授权异常
 *
 * @author Aaron
 * @version v1.0
 * @create 2018-07-12 20:15
 **/
public class AuthorityException extends BaseException {

    private static final long serialVersionUID = 6058294324031642376L;

    public AuthorityException() {
    }

    public AuthorityException(String message) {
        super(message);
    }

    public AuthorityException(String code, String message) {
        super(code, message);
    }

}