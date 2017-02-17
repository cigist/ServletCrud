/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cigist.jsprud.impl;


import com.cigist.jsprud.util.DbConn;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cigist
 */
public class StudentImpl{

    private Connection conn;

    public StudentImpl() throws ClassNotFoundException{
        conn = DbConn.getConnection();
    }

//    public void addStudent(String student) {
//        try {
//            String query = "insert into M_STUDENT (FIRSTNAME, LASTNAME, COURSE,YEAR) values (?,?,?,?)";
//            PreparedStatement preparedStatement = conn.prepareStatement(query);
//            preparedStatement.setString(1, student.getFirstName());
//            preparedStatement.setString(2, student.getLastName());
//            preparedStatement.setString(3, student.getCourse());
//            preparedStatement.setInt(4, student.getYear());
//            preparedStatement.executeUpdate();
//            preparedStatement.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public void deleteStudent(int studentId) {
//        try {
//            String query = "DELETE from M_STUDENT where STUDENT_ID=?";
//            PreparedStatement preparedStatement = conn.prepareStatement(query);
//            preparedStatement.setInt(1, studentId);
//            preparedStatement.executeUpdate();
//            preparedStatement.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public void updateStudent(Student student) {
//        try {
//            String query = "UPDATE M_STUDENT SET FIRSTNAME=?, LASTNAME=?, COURSE=?, YEAR=? where STUDENT_ID=?";
//            PreparedStatement preparedStatement = conn.prepareStatement(query);
//            preparedStatement.setString(1, student.getFirstName());
//            preparedStatement.setString(2, student.getLastName());
//            preparedStatement.setString(3, student.getCourse());
//            preparedStatement.setInt(4, student.getYear());
//            preparedStatement.setInt(5, student.getStudentId());
//            preparedStatement.executeUpdate();
//            preparedStatement.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public List<Student> getAllStudents() {
//        List<Student> students = new ArrayList<Student>();
//        try {
//            Statement statement = conn.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from M_STUDENT");
//            while (resultSet.next()) {
//                Student student = new Student();
//                student.setStudentId(resultSet.getInt(1));
//                student.setFirstName(resultSet.getString(2));
//                student.setLastName(resultSet.getString(3));
//                student.setCourse(resultSet.getString(4));
//                student.setYear(resultSet.getInt(5));
//                students.add(student);
//            }
//            resultSet.close();
//            statement.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return students;
//    }
//
//
//    public Student getStudentById(int studentId) {
//        Student student = new Student();
//        try {
//            String query = "select * from M_STUDENT where STUDENT_ID=?";
//            PreparedStatement preparedStatement = conn.prepareStatement(query);
//            preparedStatement.setInt(1, studentId);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                student.setStudentId(resultSet.getInt(1));
//                student.setFirstName(resultSet.getString(2));
//                student.setLastName(resultSet.getString(3));
//                student.setCourse(resultSet.getString(4));
//                student.setYear(resultSet.getInt(5));
//            }
//            resultSet.close();
//            preparedStatement.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return student;
//    }
}


