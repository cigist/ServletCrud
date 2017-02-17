/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cigist.jsprud.impl;

import com.cigist.jsprud.dao.MasterUserDao;
import com.cigist.jsprud.model.MasterUserBean;
import com.cigist.jsprud.util.DbConn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cigist
 */
public class MasterUserImpl implements MasterUserDao {

    private Connection conn;

    public MasterUserImpl() {
        try {
            conn = DbConn.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MasterUserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void addUser(MasterUserBean mstUser) {
        try {
            String query = "insert into MST_USER (CD_USER,USERNAME,PASSWORD,NAME,FLAG_ACTIVE) values (?,?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, mstUser.getCdUser());
            preparedStatement.setString(2, mstUser.getUsername());
            preparedStatement.setString(3, mstUser.getPassword());
            preparedStatement.setString(4, mstUser.getName());
            preparedStatement.setString(5, mstUser.getFlagActive());

            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erorr Save ! " + e);
        }
    }

    @Override
    public void deleteUser(String cdUser) {
        try {
            String query = "DELETE from MST_USER where CD_USER=?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, cdUser);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateUser(MasterUserBean mstUser) {
        try {
            String query = "UPDATE MST_USER set USERNAME=?,PASSWORD=?,NAME=?,FLAG_ACTIVE=? where CD_USER=?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, mstUser.getUsername());
            preparedStatement.setString(2, mstUser.getPassword());
            preparedStatement.setString(3, mstUser.getName());
            preparedStatement.setString(4, mstUser.getFlagActive());

            preparedStatement.setString(5, mstUser.getCdUser());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Update Erorr " + e);
        }
    }

    @Override
    public List<MasterUserBean> getAllDataUser() {
        List<MasterUserBean> dataUser = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from MST_USER");
            while (resultSet.next()) {
                MasterUserBean userBean = new MasterUserBean();

                userBean.setCdUser(resultSet.getString(1));
                userBean.setUsername(resultSet.getString(2));
                userBean.setName(resultSet.getString(4));
                userBean.setFlagActive(resultSet.getString(5));

                dataUser.add(userBean);
            }
        } catch (SQLException e) {
        }
        return dataUser;
    }

    @Override
    public List<MasterUserBean> getDataByCode(String mstUser) {
        List<MasterUserBean> dataUser = new ArrayList<>();
        try {
            String query = "select * from MST_USER where CD_USER ='" + mstUser + "'";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, mstUser);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                MasterUserBean userBean = new MasterUserBean();

                userBean.setCdUser(resultSet.getString(1));
                userBean.setUsername(resultSet.getString(2));
                userBean.setName(resultSet.getString(4));
                userBean.setFlagActive(resultSet.getString(5));

                dataUser.add(userBean);
            }
        } catch (SQLException e) {
        }
        return dataUser;

    }

    @Override
    public MasterUserBean getUsertByCode(String mstUser) {
        MasterUserBean user = new MasterUserBean();

        try {
            PreparedStatement preparedStatement = conn.prepareStatement("select * from MST_USER where CD_USER=?");
            preparedStatement.setString(1, mstUser);
            ResultSet rs = preparedStatement.executeQuery();
            
            if (rs.next()) {
                user.setCdUser(rs.getString(1));
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setName(rs.getString(4));
                user.setFlagActive(rs.getString(5));
            }
            
        } catch (SQLException e) {
            System.err.println("Erorr Log " +e);
        }
        return user;
    }

}
