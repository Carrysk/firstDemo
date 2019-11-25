package com.carrysk.Demo12JDBC.Demo03;

import com.carrysk.Demo12JDBC.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 练习 登陆 输入用户名和密码
 * 输出登陆成功或登陆失败
 */
public class JDBCPratice {

    public static void main(String[] args) {

        // 1 获取用户输入的用户名和密码
        String uname = null;
        String password = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        uname = sc.nextLine();
        System.out.println("请输入密码");
        password = sc.nextLine();

        boolean flag = login(uname, password);

        if (flag) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败，用户名或密码错误!");
        }
    }

    public static boolean login(String uname, String password) {
        if (null == uname || null == password) {
            return false;
        }
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();

            String sql = "Select id from user where username ='" + uname + "' and password ='" + password + "'";

            if (null != conn) {
                stmt = conn.createStatement();
            }

            if (null != stmt) {
                rs = stmt.executeQuery(sql);
                return rs.next();  // 如果查询到 next 为true 直接返回即可
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

}
