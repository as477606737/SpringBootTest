package com.demo.dao;


import com.demo.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao {
    int deleteByPrimaryKey(Integer var1);

    int insert(user var1);

    int insertSelective(user var1);

    user selectByPrimaryKey(Integer var1);

    int updateByPrimaryKeySelective(user var1);

    int updateByPrimaryKey(user var1);
}