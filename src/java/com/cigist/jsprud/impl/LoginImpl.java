/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cigist.jsprud.impl;

import com.cigist.jsprud.dao.LoginDao;
import com.cigist.jsprud.util.DbConn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cigist
 */
public class LoginImpl implements LoginDao {

    private Connection conn;

    public LoginImpl(){
        try {
            conn = DbConn.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean validate(String name, String pass) {
        boolean status = false;
        try {

            PreparedStatement ps = conn.prepareStatement("select USERNAME,PASSWORD from MST_USER where username=? and password=?");
            ps.setString(1, name);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

}
