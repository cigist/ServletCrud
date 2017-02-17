/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cigist.jsprud.model;

/**
 *
 * @author cigist
 */
public class UserBean {
    private String cdUser;
    private String username;
    private String password;
    private String name;
    private String flagActive;

    public String getCdUser() {
        return cdUser;
    }

    public void setCdUser(String cdUser) {
        this.cdUser = cdUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlagActive() {
        return flagActive;
    }

    public void setFlagActive(String flagActive) {
        this.flagActive = flagActive;
    }
    
}
