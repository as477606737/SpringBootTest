package com.demo.dao;


import com.demo.model.ShiroUser;

public interface ShiroUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShiroUser record);

    int insertSelective(ShiroUser record);

    ShiroUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShiroUser record);

    int updateByPrimaryKey(ShiroUser record);

    ShiroUser selectByUserName(String userName);
}