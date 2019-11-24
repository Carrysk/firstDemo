package com.carrysk.Demo12JDBC.Demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *  使用jdbc insert 一条数据
 */
public class Demo02JDBC {
    public static void main(String[] args) {
        Connection conn = null;
        Statement sttm = null;

        // 1 注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
        try {
            // 2 创建连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///student", "root", "hankun");

            // 3 执行sql
            String sql = "Insert into student_details values(3, 'lisi', 1, 12)";

            // 4 获取sql执行对象
            sttm = conn.createStatement();

            // 5 执行sql
            int count = sttm.executeUpdate(sql); // count 为影响的行数

            System.out.println(count);

            if (0 < count) {
                System.out.println("执行成功");
            } else {
                System.out.println("执行失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            // 6 释放资源
            if (null != sttm) {
                try {
                    sttm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            // 释放conn
            if (null != conn) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
