package com.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "dy_userinfo")
public class dyUserInfo {

    @Id
    @GeneratedValue
    @Column(name = "uiid")
    private String uiid;

    private String chlastname;

    private String chname;

    private String jplastname;

    private String jpname;

    private String fletszip1;

    private String fletszip2;

    private String email;

    public dyUserInfo(String uiid, String chlastname, String chname, String jplastname, String jpname, String fletszip1, String fletszip2, String email) {
        this.uiid = uiid;
        this.chlastname = chlastname;
        this.chname = chname;
        this.jplastname = jplastname;
        this.jpname = jpname;
        this.fletszip1 = fletszip1;
        this.fletszip2 = fletszip2;
        this.email = email;
    }

    public dyUserInfo() {
        super();
    }

    public String getUiid() {
        return uiid;
    }

    public void setUiid(String uiid) {
        this.uiid = uiid == null ? null : uiid.trim();
    }

    public String getChlastname() {
        return chlastname;
    }

    public void setChlastname(String chlastname) {
        this.chlastname = chlastname == null ? null : chlastname.trim();
    }

    public String getChname() {
        return chname;
    }

    public void setChname(String chname) {
        this.chname = chname == null ? null : chname.trim();
    }

    public String getJplastname() {
        return jplastname;
    }

    public void setJplastname(String jplastname) {
        this.jplastname = jplastname == null ? null : jplastname.trim();
    }

    public String getJpname() {
        return jpname;
    }

    public void setJpname(String jpname) {
        this.jpname = jpname == null ? null : jpname.trim();
    }

    public String getFletszip1() {
        return fletszip1;
    }

    public void setFletszip1(String fletszip1) {
        this.fletszip1 = fletszip1 == null ? null : fletszip1.trim();
    }

    public String getFletszip2() {
        return fletszip2;
    }

    public void setFletszip2(String fletszip2) {
        this.fletszip2 = fletszip2 == null ? null : fletszip2.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}