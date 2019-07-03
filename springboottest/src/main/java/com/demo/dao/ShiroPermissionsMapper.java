package com.demo.dao;


import com.demo.model.ShiroPermissions;

public interface ShiroPermissionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShiroPermissions record);

    int insertSelective(ShiroPermissions record);

    ShiroPermissions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShiroPermissions record);

    int updateByPrimaryKey(ShiroPermissions record);
}