package com.demo.model;

public class ShiroUser {
    private Integer id;

    private String userName;

    private String userPassword;

    private String userRoles;

    public ShiroUser(Integer id, String userName, String userPassword, String userRoles) {
        this.id = id;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRoles = userRoles;
    }

    public ShiroUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(String userRoles) {
        this.userRoles = userRoles == null ? null : userRoles.trim();
    }
}