package com.carrysk.Demo05File.demo02File;

import java.io.File;

/**
 * 递归遍历文件夹  搜索.java文件
 */
public class Demo05SearchFile {
    public static void main(String[] args) {
        File file = new File("./src");
        getAllFile(file);

    }

    private static void getAllFile(File file) {
        // 遍历file 先判断是不是目录
        if (file.isDirectory()) {
            // System.out.println(file); // 打印当前目录
            File[] files = file.listFiles();
            for (File file1 : files) {

                // 遍历子文件 是不是目录
                if (file1.isDirectory()) {

                    // 递归调用
                    getAllFile(file1);
                } else {
                    //
                    // 都可以获取文件的结尾
                    //                   String name = file1.getName();
                    //                   String name = file1.getPath();
                    String name = file1.toString();
                    name = name.toLowerCase();
                    boolean b = name.endsWith(".java");
                    if (b) {
                        System.out.println(file1); // 基线
                    }
                }
            }
        } else { // 不是目录 直接打印
            String name = file.getName();
            boolean b = name.endsWith(".java");
            if (b) {
                System.out.println(file); // 基线
            }
        }
    }
}
