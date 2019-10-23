package com.carrysk.Demo05File.demo03Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * File[] listFiles() 有其他两个重载方法 方法的参数传递的是过滤器
 * listFiles方法做了3件事
 * 1 方法对构造方法中传递的木槿路进行遍历，获取目录中的每一个文件/文件夹 -》 封装成File对象
 * 2 listFiles 方法调用参数传递的过滤器中的accept方法
 * 3 listFiles 方法会把遍历得到的每一个File对象传递给accpet方法的参数
 * <p>
 * java.io.FileFilter接口 用于抽象路径名(File对象）的过滤器 仅有一个方法
 * 抽象方法 用来过滤文件
 * public boolean accept(File file) 测试指定抽象路径名是否应该包含在某个路径名列表中
 * 返回true 则返回此文件/目录 返回false则不返回此文件
 * <p>
 * java.io.FilenameFilter接口 实现此接口的类实例可用于过滤文件名 仅有一个方法
 * 用来过滤文件名称
 * boolean accept(File dir, String name) 测试指定文件是否应该包含在某一个文件列表中
 * 参数
 * File dir 构造方法中传递的被遍历的目录
 * String name 使用ListFiles方法遍历目录，获取到的每一个文件/文件夹名称
 * 注意两个接口都没有实现类，需要自己写
 */
public class Demo01FilenameFilter {
    public static void main(String[] args) {

        File file = new File("./src");
        getAllFile(file);

    }

    private static void getAllFile(File file) {
        // 遍历file 先判断是不是目录
        if (file.isDirectory()) {

           /* // 使用匿名内部类完成
            File[] files = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File file) {
                    return file.isDirectory() || file.getName().toLowerCase().endsWith(".java");
                }
            });*/
            // 使用lambda表达式简化
            File[] files = file.listFiles(f1 -> f1.isDirectory() || f1.getName().toLowerCase().endsWith(".java"));

            /* 使用匿名内部类
            File[] files = file.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File file, String name) {
                    return new File(file, name).isDirectory() || name.toLowerCase().endsWith(".java");
                }
            });*/

            /*// 使用lambda表达式
            File[] files = file.listFiles((f1,name)-> new File(f1, name).isDirectory() || name.toLowerCase().endsWith(".java"));*/

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

