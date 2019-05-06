package com.demo.service;

import com.demo.model.user;


import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/19.
 */
public interface UserService {

      void userInfoByList(List<user> list);

    List<Map> userInfoAll();
}
