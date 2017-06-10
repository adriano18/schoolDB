package com.company.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by AdrianP on 09.06.2017.
 */
public abstract class Connector {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String DB_URL = "jdbc:mysql://173.212.192.223:3306/studentdb?useUnicode=true&characterEncoding=utf-8";
        String USER = "studentdb";
        String PASS = "J8a2B2a2";
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
