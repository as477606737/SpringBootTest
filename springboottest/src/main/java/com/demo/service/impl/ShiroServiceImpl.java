package com.demo.service.impl;

import com.demo.dao.ShiroPermissionsMapper;
import com.demo.dao.ShiroRolesMapper;
import com.demo.dao.ShiroUserMapper;
import com.demo.model.ShiroPermissions;
import com.demo.model.ShiroRoles;
import com.demo.model.ShiroUser;
import com.demo.service.ShiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: springboottest
 * @Package: com.demo.service.impl
 * @ClassName:
 * @Description: java类作用描述
 * @Author: 陈铭
 * @CreateDate: 2019/7/2 10:31
 * @UpdateUser: 陈铭
 * @UpdateDate: 2019/7/2 10:31
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
@Service

public class ShiroServiceImpl implements ShiroService {
    @Autowired
    private ShiroPermissionsMapper  perMapper ;
    @Autowired
    private ShiroRolesMapper roleMapper ;
    @Autowired
    private ShiroUserMapper userMapper;

    @Override
    public ShiroUser selectByUserName(String userName) {
        return userMapper.selectByUserName(userName);
    }

    @Override
    public ShiroRoles selectRolesById(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public ShiroPermissions selectPerById(Integer id) {
        return perMapper.selectByPrimaryKey(id);
    }
}
