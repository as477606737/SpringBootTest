package com.demo.model;

public class ShiroRoles {
    private Integer id;

    private String rolesName;

    private String rolesPer;

    public ShiroRoles(Integer id, String rolesName, String rolesPer) {
        this.id = id;
        this.rolesName = rolesName;
        this.rolesPer = rolesPer;
    }

    public ShiroRoles() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolesName() {
        return rolesName;
    }

    public void setRolesName(String rolesName) {
        this.rolesName = rolesName == null ? null : rolesName.trim();
    }

    public String getRolesPer() {
        return rolesPer;
    }

    public void setRolesPer(String rolesPer) {
        this.rolesPer = rolesPer == null ? null : rolesPer.trim();
    }
}