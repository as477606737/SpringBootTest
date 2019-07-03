package com.demo.service.impl;

import com.demo.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: springboottest
 * @Package: com.demo.service.impl
 * @ClassName:
 * @Description: java类作用描述
 * @Author: 陈铭
 * @CreateDate: 2019/7/2 15:36
 * @UpdateUser: 陈铭
 * @UpdateDate: 2019/7/2 15:36
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
@Service
public class LoginSeviceImpl implements LoginService {
    @Override
    public boolean login(String userName, String passWord) {
        if(userName == null || passWord == null){
            return false ;
        }
        String msg="";
        // 1、获取Subject实例对象
        Subject currentUser = SecurityUtils.getSubject();
        // 3、将用户名和密码封装到UsernamePasswordToken
        UsernamePasswordToken token = new UsernamePasswordToken(userName, passWord);
        try{
            currentUser.login(token);// 传到MyAuthorizingRealm类中的方法进行认证
            Session session = currentUser.getSession();
            session.setAttribute("userName", userName);
            return true;
        }catch (UnknownAccountException e){
            System.out.println("当前账户不存在");
            return false;
        }
        catch (IncorrectCredentialsException e)
        {
            e.printStackTrace();
            System.out.println("当前密码不正确");
            return false;
        }
        catch (AuthenticationException e) {
            e.printStackTrace();
            System.out.println("用户权限验证失败");
            return false;
        }

    }

    @Override
    public boolean logout() {
        return false;
    }
}
