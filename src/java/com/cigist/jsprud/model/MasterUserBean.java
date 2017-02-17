/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cigist.jsprud.model;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author cigist
 */
public class MasterUserBean {

    private String cdUser;
    private String username;
    private String password;
    private String name;
    private String flagActive;
    private String guserCreate;
    private Date dateCreate;
    private Time timeCreate;
    private String userUpdate;
    private Date dateUpdate;
    private Time timeUpdate;

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

    public String getGuserCreate() {
        return guserCreate;
    }

    public void setGuserCreate(String guserCreate) {
        this.guserCreate = guserCreate;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Time getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Time timeCreate) {
        this.timeCreate = timeCreate;
    }

    public String getUserUpdate() {
        return userUpdate;
    }

    public void setUserUpdate(String userUpdate) {
        this.userUpdate = userUpdate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Time getTimeUpdate() {
        return timeUpdate;
    }

    public void setTimeUpdate(Time timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
    
}
