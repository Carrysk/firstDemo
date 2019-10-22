package com.carrysk.Demo05File.demo02File;

import java.io.File;
import java.io.IOException;

/**
 * File 的创建删除功能方法
 * public boolean createNewFile() 当且仅当该名称的文件不存在时，创建一个新的文件夹
 * public boolean mkdir() 创建由此File表示的文件夹
 * public boolean mkdirs() 创建由此File表示的目录，包括任务必需但不存在的目录
 * public boolean delete(） 删除此File表示的文件或目录  删除文件直接将文件从磁盘删除 不经过垃圾回收站
 */
public class Demo02FileModify {
    public static void main(String[] args) {
        show04();
    }

    /**
     * public boolena delete() 删除此File表示的文件或目录
     */
    private static void show04() {
        System.out.println("开始删除创建的文件");
        File f1 = new File("./a.txt");
        boolean delete = f1.delete();
        System.out.println(delete);

        File f2 = new File("./a");  // 如果被删除的是文件夹 且下面由文件 不能直接删除
        System.out.println(f2.exists());
        boolean delete1 = f2.delete();
        System.out.println(delete1);
    }

    /**
     * 创建多级文件夹，会创建过程文件夹
     */
    private static void show03() {
        File file = new File("./a/b/c/d.txt");  // 创建了a/b/c/d.txt的文件夹 d.txt 不是文件
        boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);
    }

    /**
     * 创建文件夹mkdir()
     */
    private static void show02() {
        File file = new File("./a");
        boolean mkdir = file.mkdir();
        System.out.println("mkdir " + mkdir);
    }

    /**
     * 创建文件
     */
    private static void show01() {
        File file = new File("./a.txt");
        try {
            boolean newFile = file.createNewFile();
            System.out.println("show01 : " + newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
