package com.carrysk.Demo12JDBC.Demo02;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Demo01ResultSetPratice {

    public static void main(String[] args) {
        List<Student> students = findAll();
        Student stu = null;
        if (null != students) {
            for (int i = 0; i < students.size(); i++) {
                stu = students.get(i);
                System.out.println(stu);

            }
        }
    }

    /**
     * 查询所以student对象
     *
     * @return
     */
    public static List<Student> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Student> result = new ArrayList<>();
        // 1 注册驱动
        // 2 获取Connection
        try {
            conn = DriverManager.getConnection("jdbc:mysql:///student", "root", "hankun");

            stmt = conn.createStatement();

            String sql = "select * from student_details";

            // 执行sql
            rs = stmt.executeQuery(sql);


            // 返回结果集
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString("name");
                int gender = rs.getInt("gender");
                int age = rs.getInt("age");

                result.add(new Student(id, name, gender, age));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (null != rs) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (null != stmt) {
                try {
                    stmt.close();
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
        return result;
    }
}
