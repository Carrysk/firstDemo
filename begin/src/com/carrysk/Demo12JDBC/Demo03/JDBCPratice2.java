package com.carrysk.Demo12JDBC.Demo03;

import com.carrysk.Demo12JDBC.utils.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * 练习 登陆 输入用户名和密码
 * 输出登陆成功或登陆失败
 */
public class JDBCPratice2 {

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
        PreparedStatement preStmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();

            String sql = "Select id from user where username = ? and password = ?";

            if (null != conn) {
                preStmt = conn.prepareStatement(sql);
            }


            if (null != preStmt) {

                // 1 赋值
                preStmt.setString(1, uname);
                preStmt.setString(2, password);


                rs = preStmt.executeQuery();
                return rs.next();  // 如果查询到 next 为true 直接返回即可
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

}
