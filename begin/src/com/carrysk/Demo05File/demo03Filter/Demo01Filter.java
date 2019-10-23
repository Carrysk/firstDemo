package com.carrysk.Demo05File.demo03Filter;

import java.io.File;

/**
 * File[] listFiles() 有其他两个重载方法 方法的参数传递的是过滤器
 * listFiles方法做了3件事
 *    1 方法对构造方法中传递的木槿路进行遍历，获取目录中的每一个文件/文件夹 -》 封装成File对象
 *    2 listFiles 方法调用参数传递的过滤器中的accept方法
 *    3 listFiles 方法会把遍历得到的每一个File对象传递给accpet方法的参数
 *
 *   java.io.FileFilter接口 用于抽象路径名(File对象）的过滤器
 *   抽象方法 用来过滤文件
 *       public boolean accept(File file) 测试指定抽象路径名是否应该包含在某个路径名列表中
 *           返回true 则返回此文件/目录 返回false则不返回此文件
 *
 *   java.io.FilenameFilter接口 实现此接口的类实例可用于过滤文件名
 *     用来过滤文件名称
 *     boolean accept(File dir, String name) 测试指定文件是否应该包含在某一个文件列表中
 *     参数
 *        File dir 构造方法中传递的被遍历的目录
 *        String name 使用ListFiles方法遍历目录，获取到的每一个文件/文件夹名称
 * 注意两个接口都没有实现类，需要自己写
 */
public class Demo01Filter {
    public static void main(String[] args) {

        File file = new File("./src");
        getAllFile(file);

    }

    private static void getAllFile(File file) {
        // 遍历file 先判断是不是目录
        if (file.isDirectory()) {
            // System.out.println(file); // 打印当前目录
            File[] files = file.listFiles(new FileFilterImp());
            for (File file1 : files) {

                // 遍历子文件 是不是目录
                if (file1.isDirectory()) {

                    // 递归调用
                    getAllFile(file1);
                } else {
                    System.out.println(file1); // 基线
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

