package com.demo.controller;

import com.demo.model.demo;
import com.demo.model.user;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: springboottest
 * @Package: com.demo.controller
 * @ClassName: 用户管理
 * @Description: java类作用描述
 * @Author: 陈铭
 * @CreateDate: 2019/3/29 11:04
 * @UpdateUser: 陈铭
 * @UpdateDate: 2019/3/29 11:04
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/userAdd")
    public int addUser(){
        System.out.println("add");
        List list = new ArrayList();
      user us1 = new user();
      us1.setUserid(7);
      us1.setUsername("测试数据1");
      us1.setPassword("测试数据1");
      us1.setPhone("2222");
      user us2 = new user();
        us2.setUserid(8);
        us2.setUsername("测试数据2");
        us2.setPassword("测试数据2");
        us2.setPhone("23332");
        list.add(us1);
        list.add(us2);
        userService.userInfoByList(list);
        return 1;
    }


    @RequestMapping(value = "/test/{username}/{password}" , method = RequestMethod.GET )
    @ResponseBody
    public String Test(@PathVariable String username, @PathVariable String password){
        System.out.println("这里做一个测试");
        return "test:"+username+"/"+password;
    }


    @RequestMapping(value = "/postTest" ,method = RequestMethod.POST)
    @ResponseBody
    public  Object PostTest(@RequestBody  demo demo){
      Map map = new HashMap();
      map.put("aa","bb");
        return  map ;
    }
}
