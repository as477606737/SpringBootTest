package com.demo.service;

import com.demo.model.ShiroPermissions;
import com.demo.model.ShiroRoles;
import com.demo.model.ShiroUser;

public interface ShiroService {

    ShiroUser selectByUserName(String userName);
    ShiroRoles selectRolesById(Integer id);
    ShiroPermissions selectPerById(Integer id);
}
