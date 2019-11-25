package com.carrysk.Demo12JDBC.utils;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * 根据类 完成一个 JDBC 工具类
 * 成员方法都是静态方法 这样可以使用类名.成员方法
 */
public class JDBCUtils {
    private static String url;
    private static String username;
    private static String password;
    private static String driver;

    /**
     * static 代码块 完成一次读取即可
     */
    static {
        try {

            // 读取配置文件

            Properties props = new Properties();

            // 通过classLoader 字节码 获取路径
            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
            URL url = classLoader.getResource("com/carrysk/Demo12JDBC/utils/jdbc.properties");
            String path = url.getPath();

            props.load(new FileReader(path));

            JDBCUtils.url = props.getProperty("url");
            username = props.getProperty("username");
            password = props.getProperty("password");
            driver = props.getProperty("driver");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 返回一个Connection 对象
     *
     * @return
     */
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 释放资源
     *
     * @param conn 数据库连接对象
     * @param stmt 数据库执行对象
     */
    public static void close(Connection conn, Statement stmt) {

        if (null != conn) {
            try {
                conn.close();
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
    }

    /**
     * 释放资源 重载
     *
     * @param conn
     * @param stmt
     * @param rs
     */
    public static void close(Connection conn, Statement stmt, ResultSet rs) {

        if (null != conn) {
            try {
                conn.close();
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

        if (null != rs) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
