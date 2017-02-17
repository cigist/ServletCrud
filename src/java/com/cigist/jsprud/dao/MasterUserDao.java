/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cigist.jsprud.dao;

import com.cigist.jsprud.model.MasterUserBean;

import java.util.List;

/**
 *
 * @author cigist
 */
public interface MasterUserDao {

    public void addUser(MasterUserBean mstUser);

    public void deleteUser(String cdUser);

    public void updateUser(MasterUserBean mstUser);

    public List<MasterUserBean> getAllDataUser();

    public MasterUserBean getUsertByCode(String mstUser);

    public List<MasterUserBean> getDataByCode(String mstUser);
}
