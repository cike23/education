package com.attech.core.config;

import com.attech.core.base.Result;
import com.attech.core.constants.BaseEnums;
import com.attech.core.exception.AuthorityException;
import com.attech.core.exception.BaseException;
import com.attech.core.exception.ServiceException;
import com.attech.core.util.Results;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * 全局异常处理类
 *
 * @author Aaron
 * @version v1.0
 * @create 2018-07-12 20:06
 **/
@RestControllerAdvice
public class GlobalExceptionConfig {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionConfig.class);

    /**
     * 处理 ServiceException 异常
     * @param e
     * @return
     */
    @ExceptionHandler(ServiceException.class)
    public Result handleServiceException(ServiceException e){
        // 设置异常信息编号和异常信息
        Result result = Results.failure(e.getCode(), e.getMessage());
        // 设置Http异常状态码
        result.setStatus(HttpStatus.BAD_REQUEST.value());
        // 设置Http异常消息
        log.info("ServiceException[ code:[], message:[] ]", e.getCode(), e.getMessage());
        return result;
    }

    /**
     * 处理 AuthorityException 异常
     * @param e
     * @return
     */
    @ExceptionHandler(AuthorityException.class)
    public Result handleAuthorityException(AuthorityException e){
        Result result = Results.failure(e.getCode(), e.getMessage());
        result.setStatus(HttpStatus.FORBIDDEN.value());
        log.info("AuthorityException[ code:[], message:[] ]", e.getCode(), e.getMessage());
        return null;
    }

    /**
     * 处理 NoHandlerFoundException 异常. <br/>
     * 需配置 [spring.mvc.throw-exception-if-no-handler-found=true]
     * 需配置 [spring.resources.add-mappings=false]
     * @param e
     * @return
     */
    @ExceptionHandler(NoHandlerFoundException.class)
    public Result handleNotFoundException(NoHandlerFoundException e){
        Result result = Results.failure(BaseEnums.NOT_FOUND.code(), BaseEnums.NOT_FOUND.desc());
        result.setStatus(HttpStatus.NOT_FOUND.value());
        log.info("NoHandlerFoundException[ message:[] ]", e.getMessage());
        return result;
    }

    /**
     * 处理 BaseException 异常
     * @param e
     * @return
     */
    @ExceptionHandler(BaseException.class)
    public Result handleBaseException(BaseException e){
        Result result = Results.failure(e.getCode(), e.getMessage());
        result.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        log.error("BaseException[ code:[], message:[] ]", e.getCode(), e.getMessage(), e);
        return result;
    }

    /**
     * 处理 Exception 异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e){
        Result result = Results.failure(BaseEnums.ERROR.code(), BaseEnums.ERROR.desc());
        result.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        log.error("Exception[ message:[] ]", e.getMessage(), e);
        return result;
    }

}