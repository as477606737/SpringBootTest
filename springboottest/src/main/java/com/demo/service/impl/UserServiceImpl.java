package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.model.user;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: springboottest
 * @Package: com.demo.service.impl
 * @ClassName:
 * @Description: java类作用描述
 * @Author: 陈铭
 * @CreateDate: 2019/3/29 11:17
 * @UpdateUser: 陈铭
 * @UpdateDate: 2019/3/29 11:17
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
@Service(value =  "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Transactional //事务管理
    @Override
    public void userInfoByList(List<user> list) {
        userDao.userInfoByList(list);
    }

    @Override
    public List<Map> userInfoAll() {
        return userDao.userInfoAll();
    }
}
