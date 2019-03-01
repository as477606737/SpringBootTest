package com.demo.springboottest;

import com.demo.dao.UserDao;
import com.demo.jpa.DyUserInfoJpa;
import com.demo.jpa.UserJPA;
import com.demo.model.dyUserInfo;
import com.demo.model.user;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.demo.dao")
public class SpringboottestApplicationTests {


    @Autowired
    private UserDao userDao;//这里会报错，但是并不会影响

    @Autowired
    private UserJPA userJPA;

    @Autowired
    private DyUserInfoJpa dyUserInfoJpa;

	@Test
	public void contextLoads() {
     //  System.out.println("测试结果："+userDao.selectByPrimaryKey(1).getUsername());
//        System.out. println("结果:"+userJPA.findAll());
//        Optional<user> us = userJPA.findById(1) ;
//        user use = us.get();
//        System.out.println(use.getPhone());
        dyUserInfo dyUserInfo = new dyUserInfo();
      //  dyUserInfo.setUiid("2");

        Example<dyUserInfo> ex = Example.of(dyUserInfo);
//        Optional<dyUserInfo> us =   dyUserInfoJpa.findOne(ex);

        //JPA排序和简单分页
        Sort.Direction sort =  Sort.Direction.ASC;  //升序
        ///获取PageRequest对象 index:页码 从0开始  size每页容量 sort排序方式 "uiid"->properties 以谁为准排序
        Pageable pageable = PageRequest.of(0, 2, sort, "uiid");
        Page<dyUserInfo> page =    dyUserInfoJpa.findAll(ex,pageable); //返回一个Page
///获取总页数
        System.out.println("总页数："+ page.getTotalPages());
///获取总元素个数
        System.out.println("个数："+  page.getTotalElements());
///获取该分页的列表
        List<dyUserInfo> list = page.getContent();
        System.out.println("分页："+list);


    }

}
