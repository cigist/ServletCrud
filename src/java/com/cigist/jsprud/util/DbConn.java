/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cigist.jsprud.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author cigist
 */
public class DbConn {

    private static Connection conn;

    public static Connection getConnection() throws ClassNotFoundException{
//        Properties properties = new Properties();
// 
//        InputStream input = DbConn.class.getClassLoader().getResourceAsStream("/jdbc.properties");

        try {
//            properties.load(input);
//            String driverName = properties.getProperty("jdc.driver");
//            String JdbcUrl = properties.getProperty("jdc.url");
//            String user = properties.getProperty("jdbc.user");
//            String password = properties.getProperty("jdbc.password");
//            Class.forName(driverName);
//            conn = DriverManager.getConnection(JdbcUrl, user, password);

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root","root");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed Connection");
        }

        return conn;
    }

    public static void closeConnection(Connection toBeClosed) {
        if (toBeClosed == null) {
            return;
        }
        try {
            toBeClosed.close();
        } catch (SQLException e) {
        }
    }

}
