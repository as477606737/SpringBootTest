package com.demo.dao;


import com.demo.model.ShiroRoles;

public interface ShiroRolesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShiroRoles record);

    int insertSelective(ShiroRoles record);

    ShiroRoles selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShiroRoles record);

    int updateByPrimaryKey(ShiroRoles record);
}