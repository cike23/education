package com.attech.core.system.controller;

import com.attech.core.base.BaseController;
import com.attech.core.base.Result;
import com.attech.core.constants.BaseEnums;
import com.attech.core.constants.Constants;
import com.attech.core.system.dto.User;
import com.attech.core.util.DateUtil;
import com.attech.core.util.Results;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc: 用户Controller
 * Author: Aaron
 * Time: 2018/7/10 23:55.
 * Version: v1.0
 *
 * 用户控制层；用@RestController注解，前后端分离，因为无需返回视图，采用Restful风格，直接返回数据。
 */
@RequestMapping("/sys/user")
@RestController
public class UserController extends BaseController {

    private static final Logger  log = LoggerFactory.getLogger(UserController.class);

    private static List<User> userList = new ArrayList<>();

    // 先静态模拟数据
    static {
        User user1 = new User();
        user1.setUserId(1L);
        user1.setUsername("lufei");
        user1.setNickname("蒙奇D路飞");
        user1.setBirthday(DateUtil.parseDate("2000-05-05"));
        user1.setSex(Constants.Sex.MALE);
        user1.setEnabled(Constants.Flag.YES);
        userList.add(user1);

        User user2 = new User();
        user2.setUserId(2L);
        user2.setUsername("nami");
        user2.setNickname("娜美");
        user2.setBirthday(DateUtil.parseDate("2000/7/3"));
        user2.setSex(Constants.Sex.FEMALE);
        user2.setEnabled(Constants.Flag.YES);
        userList.add(user2);
    }

    @RequestMapping("/queryAll")
    public Result queryAll(){
        return Results.successWithData(userList, BaseEnums.SUCCESS.code(), BaseEnums.SUCCESS.desc());
    }

    @RequestMapping("/queryOne/{userId}")
    public Result queryOne(@PathVariable Long userId){
        User user = null;
        for(User u : userList){
            if(u.getUserId().longValue() == userId){
                user = u;
            }
        }
        return Results.successWithData(user);
    }

}
