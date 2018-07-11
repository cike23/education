package com.attech.core.system.dto;

import com.attech.core.base.BaseDTO;
import com.attech.core.util.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * Desc: 系统用户
 * Author: Aaron
 * Time: 2018/7/10 23:54.
 * Version: v1.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User extends BaseDTO{

    private static final long serialVersionUID = -7395431342743009038L;

    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户生日
     */
    @JsonFormat(pattern = DateUtil.Pattern.DATE)
    private Date birthday;

    /**
     * 性别: 1-男; 0-女
     */
    private Integer sex;
    /**
     * 是否启用：1/0
     */
    private Integer enabled;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}
