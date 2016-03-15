package com.mscharhag.javaee8.mvc.requestparams.bean;

import com.mscharhag.javaee8.mvc.requestparams.Role;

import javax.ws.rs.FormParam;

public class User {

    @FormParam("id")
    private long id;

    @FormParam("name")
    private String name;

    @FormParam("role")
    private Role role;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
