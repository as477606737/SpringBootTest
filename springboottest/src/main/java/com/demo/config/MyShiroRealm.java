package com.demo.config;

import com.demo.model.ShiroPermissions;
import com.demo.model.ShiroRoles;
import com.demo.model.ShiroUser;
import com.demo.service.ShiroService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import sun.rmi.runtime.Log;

import java.util.logging.Logger;

/**
 * @ProjectName: springboottest
 * @Package: com.demo.config
 * @ClassName:
 * @Description: java类作用描述
 * @Author: 陈铭
 * @CreateDate: 2019/7/2 14:52
 * @UpdateUser: 陈铭
 * @UpdateDate: 2019/7/2 14:52
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2019
 */
public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    private ShiroService shiroService ;


    //用户角色和权限的添加
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取登录用户名
        String userName = (String) principalCollection.getPrimaryPrincipal();
        //查询用户名称
      ShiroUser user = shiroService.selectByUserName(userName);
      //获取用户角色
      ShiroRoles roles = shiroService.selectRolesById(Integer.parseInt(user.getUserRoles()));
      //获取用户的权限
      ShiroPermissions permissions = shiroService.selectPerById(Integer.parseInt(roles.getRolesPer()));
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addRole(roles.getRolesName());
        simpleAuthorizationInfo.addStringPermission(permissions.getPermissionsName());
        return simpleAuthorizationInfo;
    }


    //用户认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("MyShiroRealm.doGetAuthenticationInfo()");
        //获取用户的输入的账号.
        String userName = (String)token.getPrincipal();
        String password = new String((char[])token.getCredentials()); 	//得到密码
       // String pwd = new SimpleHash("md5",userName,password,2).toString();
        //通过username从数据库中查找 User对象.
        //实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
    ShiroUser user =    shiroService.selectByUserName(userName);
       // User user = userService.findByUserName(userName);
        System.out.println("----->>user="+user);
        if(user == null){
            return null;
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getUserName(), //这里传入的是user对象，比对的是用户名，直接传入用户名也没错，但是在授权部分就需要自己重新从数据库里取权限
                user.getUserPassword(), //密码
                getName()  //realm name
        );
        return authenticationInfo;
    }
}
