package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springboottest
 * @Package: com.demo.controller
 * @ClassName:
 * @Description: java类作用描述
 * @Author: 陈铭
 * @CreateDate: 2019/7/3 14:47
 * @UpdateUser: 陈铭
 * @UpdateDate: 2019/7/3 14:47
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
@RestController

@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate strRedis;

    @RequestMapping("/set")
    public void test() {
        strRedis.opsForValue().set("mycache", "我存入的第一个cache");

    }

}
