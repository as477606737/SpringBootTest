package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springboottest
 * @Package: com.demo.controller
 * @ClassName:
 * @Description: java类作用描述
 * @Author: 陈铭
 * @CreateDate: 2021/1/28 8:56
 * @UpdateUser: 陈铭
 * @UpdateDate: 2021/1/28 8:56
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot" ;
    }
}
