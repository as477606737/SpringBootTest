package com.demo.model;

public class ShiroPermissions {
    private Integer id;

    private String permissionsName;

    public ShiroPermissions(Integer id, String permissionsName) {
        this.id = id;
        this.permissionsName = permissionsName;
    }

    public ShiroPermissions() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionsName() {
        return permissionsName;
    }

    public void setPermissionsName(String permissionsName) {
        this.permissionsName = permissionsName == null ? null : permissionsName.trim();
    }
}