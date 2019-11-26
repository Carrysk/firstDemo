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
 * 4ResultSet 结果集对象，封装查询结果
 *   * boolean next() 游标向下移动一行 是否到达最后一行
 *   * getXxx(参数) 获取数据
 *       ** Xxx 代表数据类型 int Double Float String...
 *       参数
 *          int 代表列的编号 从1开始
 *          String 代表列名称
 * 5PrepareStatement 执行sql对象
 *   1 sql注入问题 在拼接字符串时可能发生sql注入
 *   2 解决sql注入问题 使用PrepareStatement对象来解决
 *   3 PrepareStatement 继承自Statement
 *   4 预编译sql 参数使用？做占位符
 *   5步骤
 *      1 导入jar
 *      2 注册驱动
 *      3 获取数据库连接对象
 *      4 定义sql
 *         使用 ？做参数的占位符
 *      5 获取PrepareStatement对象 Connection.prepareStatement(sql)
 *      6 ？ 赋值
 *        ** setXxx(参数1， 参数2）
 *           Xxx 数据类型
 *           参数1 ? 第n个？ 从 1 开始
 *           参数2 ？的value
 *      7 执行sql
 *      8 处理结果
 *      9 释放资源
 *   **** 执行sql 需要使用prepareStatement预编译对象 防止sql注入
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
