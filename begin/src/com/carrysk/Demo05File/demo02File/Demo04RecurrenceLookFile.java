package com.carrysk.Demo05File.demo02File;

import java.io.File;

/**
 * 递归遍历文件夹
 */
public class Demo04RecurrenceLookFile {
    public static void main(String[] args) {
        File file = new File("./src");
        getAllFile(file);

    }

    private static void getAllFile(File file) {
        // 遍历file 先判断是不是目录
        if (file.isDirectory()){
            System.out.println(file); // 打印当前目录

            File[] files = file.listFiles();
            for (File file1 : files) {

                // 遍历子文件 是不是目录
                if (file1.isDirectory()){

                    // 递归调用
                    getAllFile(file1);
                } else {
                    System.out.println(file1); // 基线
                }
            }
        } else { // 不是目录 直接打印
            System.out.println(file);
        }
    }
}
