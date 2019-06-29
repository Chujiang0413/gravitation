package com.force.mall.user.jdbcTest;

import java.sql.*;

public class SqlConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/jingteng";
    private static final String NAME = "root";
    private static final String PASSWORD = "123456";
    public void TheSqlConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("连接成功");
        } catch (ClassNotFoundException e) {
            System.out.println("连接失败");
            e.printStackTrace();
        }
        Connection conn = null;
        try {
            System.out.println("开始获取");
            conn = DriverManager.getConnection(URL, NAME, PASSWORD);
            System.out.println("获取成功");
        } catch (SQLException e) {
            System.out.println("获取失败");
            e.printStackTrace();
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                conn = null;
            }
        }
    }
}
