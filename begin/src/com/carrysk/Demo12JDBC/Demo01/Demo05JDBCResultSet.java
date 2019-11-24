package com.carrysk.Demo12JDBC.Demo01;


import java.sql.*;

/**
 * 使用 ResultSet 将查询的结果打印
 */
public class Demo05JDBCResultSet {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql:///student", "root", "hankun");
            stmt = conn.createStatement();

            String sql = "select * from student_details";
            rs = stmt.executeQuery(sql);

            // 打印结果
            while (rs.next()) {  // 循环判断 游标是否是最后一行

                int id = rs.getInt(1);
                String name = rs.getString("name");
                int gender = rs.getInt(3);
                int age = rs.getInt(4);
                System.out.println(id + "---" + name + "---" + (gender == 1 ? "男" : "女") + "---" + age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
