package com.demo.controller;

import com.demo.service.LoginService;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @ProjectName: springboottest
 * @Package: com.demo.controller
 * @ClassName:
 * @Description: java类作用描述
 * @Author: 陈铭
 * @CreateDate: 2019/7/2 15:22
 * @UpdateUser: 陈铭
 * @UpdateDate: 2019/7/2 15:22
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
@Controller
public class ShiroController {

 @Resource
 private LoginService loginService ;

    /** 
    * @Description: 跳转到登录界面
    * @Param: [] 
    * @return: java.lang.String 
    * @Author: 陈铭 
    * @Date: 2019/7/2 
    */ 
    @RequestMapping({"/","/login"})
    public String index(){
        return"/login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(Map<String, Object> map, HttpServletRequest request) throws Exception{
        System.out.println("-----进入登录------");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
    Boolean res =     loginService.login(userName,password);

        if(res)
        {
            return "/index";
        }
        else {
            return "/403";
        }
    }


    /** 
    * @Description:没有权限退出
    * @Param: [] 
    * @return: java.lang.String 
    * @Author: 陈铭 
    * @Date: 2019/7/2 
    */ 
    @RequestMapping("/403")
    public String unauthorizedRole(){
        System.out.println("------没有权限-------");
        return "/user/403";
    }

    /** 
    * @Description: 退出登录
    * @Param: [session] 
    * @return: java.lang.String 
    * @Author: 陈铭 
    * @Date: 2019/7/2 
    */ 
    @RequestMapping("/logout")
    public String logOut(HttpSession session) {
        System.out.println("------退出登录-------");
        return "/login";
    }


    @RequestMapping("/roles")
    @RequiresRoles("学生")
    public String RolesTest(){
        System.out.println("角色权限设置");
        return null ;
    }




}
