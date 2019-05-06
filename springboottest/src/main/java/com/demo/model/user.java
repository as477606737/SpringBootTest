package com.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "t_user")
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_Id")
    private Integer userid;

    @Column(name = "user_name")
    private String username;
    @Column(name = "user_password")
    private String password;
    @Column(name = "user_phone")
    private String phone;

    public user(Integer userid, String username, String password, String phone) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    public user() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}