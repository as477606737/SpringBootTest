package com.demo.service;


/**
* @Description: shiro使用的相关逻辑业务
* @Param:
* @return:
* @Author: 陈铭
* @Date: 2019/7/2
*/
public interface LoginService {
    //登录验证
    boolean login(String userName , String passWord);
    //登出
    boolean logout();
}
