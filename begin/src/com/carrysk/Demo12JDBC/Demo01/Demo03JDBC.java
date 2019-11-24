package com.carrysk.Demo12JDBC.Demo01;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * update 一条数据
 */
public class Demo03JDBC {
    public static void main(String[] args) {
        Connection conn = null;
        Statement sttm = null;

        try {

            // 2 获取connection 连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///student", "root", "hankun");

            // 3 创建sql
            String sql = "update student_details set age = 18 where id = 3";

            // 4 获取sql执行对象
            sttm = conn.createStatement();

            // 5 执行sql
            int count = sttm.executeUpdate(sql); // count 为影响的行数

            System.out.println(count);
            if (0 < count) {
                System.out.println("Update success");
            } else {
                System.out.println("update failed");
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
