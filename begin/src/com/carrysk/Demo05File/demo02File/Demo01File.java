package com.carrysk.Demo05File.demo02File;

import java.io.File;

/**
 * File 判断的方法
 *    public boolean exists() 判断此目录或文件是否存在
 *    public boolean isDirectory() 此File表示的是否是目录
 *    public boolean isFile() 此File表示是否为文件
 */
public class Demo01File {
    public static void main(String[] args) {
        show03();
    }

    /**
     * public boolean isFile() 此File表示是否为文件
     */
    private static void show03() {
        File file = new File("./src");
        System.out.println(file.isFile());
    }

    /**
     * public boolean isDirectory() 此File表示的是否是目录
     */
    private static void show02() {
        File file = new File("./src");
        System.out.println(file.isDirectory());
    }

    /**
     *  public boolean exists() 判断此目录或文件是否存在
     */
    private static void show01() {
        File file = new File("./src");
        System.out.println(file.exists());
    }
}
