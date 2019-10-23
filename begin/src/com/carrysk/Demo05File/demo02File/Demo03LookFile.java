package com.carrysk.Demo05File.demo02File;

import java.io.File;

/**
 * File 目录的遍历
 *  public String[] list() 返回目录的 string
 *  public File[] listFiles() 返回目录的 File对象
 *
 *  注意
 *      如果目录不存在 或不是目录 则报异常
 */
public class Demo03LookFile {
    public static void main(String[] args) {
        show02();
    }

    /**
     * public File[] listFiles()
     */
    private static void show02() {
        File file = new File("./src");
        if(file.isDirectory()) {
            File[] files = file.listFiles();
            System.out.println(files);
        }
    }

    /**
     * 使用 public String[] list()
     */
    private static void show01() {
        File file = new File("./src");
        if (file.isDirectory()){
            String[] list = file.list();
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
