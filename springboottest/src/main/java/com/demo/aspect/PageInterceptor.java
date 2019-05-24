package com.demo.aspect;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: springboottest
 * @Package: com.aspect
 * @ClassName: mysql分页处理
 * @Description: java类作用描述
 * @Author: 陈铭
 * @CreateDate: 2019/5/24 9:40
 * @UpdateUser: 陈铭
 * @UpdateDate: 2019/5/24 9:40
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
@Aspect
@Component
public class PageInterceptor {
    @Pointcut("execution(* com.demo.controller.*.*Paging(..))")

    public void controllerAspect(){}

    /**
     * 定义前置通知:前置通知
     */
    @Before("controllerAspect()")
    public  void  beginTransaction(){
        System.out.println("前置通知....");
    }

    @Around("controllerAspect()")
    public Object process(ProceedingJoinPoint point) throws Throwable {
        Object[] args = point.getArgs();
        if(args.length<2) {
            //规定原方法的参数最后两个是当前页和每页条数
            throw new Exception("参数不够分页");
        }
        PageHelper.startPage((Integer)args[args.length-2],(Integer)args[args.length-1]);
        List list = (List) point.proceed();
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }
}

