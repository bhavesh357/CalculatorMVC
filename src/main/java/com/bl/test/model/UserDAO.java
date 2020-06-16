package com.bl.test.model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bl.test.DatabaseConnector;

public class UserDAO {

    private static Connection con;
    private static PreparedStatement ps;
    public static User getUser(String emailid, String pwd) throws SQLException {
        User user = null;
        con= DatabaseConnector.getConnection();
        ps=con.prepareStatement("select * from mydatabase.newusers where emailId=? and password=?");
        ps.setString(1,emailid);
        ps.setString(2,pwd);
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()){
            user=new User();
            user.setName(resultSet.getString(1));
            user.setPassword(resultSet.getString(2));
        }
        return user;
    }

    public static int insertUser(String username,String email,String password) throws SQLException {
        con= DatabaseConnector.getConnection();
        User user = new User();
        user.setName(username);
        user.setPassword(password);
        user.setEmail(email);
        ps=con.prepareStatement("insert into mydatabase.newusers(name,emailId,password) values(?,?,?)");
        ps.setString(1,user.getName());
        ps.setString(2,user.getEmail());
        ps.setString(3,user.getPassword());
        int status = ps.executeUpdate();
        return status;
    }

    public static User getUser(String emailId) throws SQLException {
        User user = null;
        con= DatabaseConnector.getConnection();
        ps=con.prepareStatement("select * from mydatabase.newusers where emailId=?");
        ps.setString(1,emailId);
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()){
            user=new User();
            user.setName(resultSet.getString(1));
            user.setPassword(resultSet.getString(2));
        }
        return user;
    }
}
