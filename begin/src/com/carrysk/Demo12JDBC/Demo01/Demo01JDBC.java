package com.carrysk.Demo12JDBC.Demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 1DrivelManager: 驱动管理对象
 *   1 注册驱动 告诉程序该使用哪一个数据库驱动jar
 *      static void registerDriver(Driver driver) 注册于给定的驱动程序 DriverManager
 *      mysql 5 之后都可省略
 *   2 获取数据库连接对象
 *     static Connection getConnection(String url, String uname, String password);
 *     参数
 *        url 指定连接地址
 *           语法 jdbc:mysql://ip地址:端口号/数据库名
 *           例子 jdbc:mysql://localhost:3306/student
 *           细节 如果是连接本机mysql服务器 并且默认的服务器端口是3306，则url可简写jdbc:mysql://数据库名
 *       uname 用户名
 *       password 密码
 * 2Connection 对象
 *   1 功能
 *     获取执行sql对象
 *       Statement createStatement()
 *       PreparedStatement prepareStatement(String sql)
 *     管理事务
 *       开启事务 setAutoCommit(boolean autoCommit) 调用该方法设置参数为false 即开启事务
 *       提交事务 commit()
 *       回滚事务 rollback()
 * 3Statement interface 执行sql的对象
 *   1 执行sql
 *      1 boolean execute(String sql) 可以执行任意的sql 了解
 *      2 int executeUpdate(String sql) 执行DML(insert update delete) 语句, DDL(create, alter, drop)语句
 *        ** 返回 影响的行数 可以通过这个影响的行数判断DML语句是否执行成功， 返回值>0则执行成功， 反之，则失效
 *      3 ResultSet executeQuery(String sql) 执行DQL(select)语句
 *
 *
 */
public class Demo01JDBC {
    public static void main(String[] args) throws Exception {

        // 1 导入驱动jar包
        // 2 注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
        // 3 获取驱动连接对象
        Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "hankun");
        // 4 定义sql语句
        String sql = "update student_details set age = 18 where id = 1";
        // 5 获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();
        // 6 执行sql
        int i = stmt.executeUpdate(sql);
        // 7 处理结果
        System.out.println(i);
        // 8 释放资源
        conn.close();
        stmt.close();

    }
}
