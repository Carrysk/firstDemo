package com.carrysk.Demo05File.demo01File;

import java.io.File;

/**
 * File 中一些获取的api
 *   getAbsolutePath(); 返回File类的绝对路径字符串
 *   getPath  将此file转化为字符串
 *   getName 返回当前文件或文件夹的名字
 *   length 返回此file的大小（文件夹和不存在都返回0)
 */
public class Demo03FileGet {
    public static void main(String[] args) {

        show04();
    }

    /**
     *  length 返回此file的大小（文件夹和不存在都返回0)
     */
    private static void show04() {
        File f1 = new File("/Users/hankun/Desktop/javaBegin/firstDemo/README.md");
        long l1 = f1.length();
        System.out.println(l1);

        File f2 = new File("/src/com/carrsk/Demo05File/demo01File");
        long l2 = f2.length();
        System.out.println(l2);

        File f3 = new File("/src/com/carrsk/Demo05File/demo01File/README.md");
        long l3 = f3.length();
        System.out.println(l3);
        System.out.println(f3.getAbsolutePath());

    }

    /**
     * getName 返回当前文件或文件夹的名字
     */
    private static void show03() {
        File f1 = new File("/Users/hankun/Desktop/javaBegin/firstDemo/README.md");
        String name = f1.getName();
        System.out.println(name);

        File f2 = new File("/src/com/carrsk/Demo05File/demo01File");
        String name2 = f2.getName();
        System.out.println(name2);
}

    /**
     * getPath  将此file转化为字符串
     * toString  源码就是getPath
     */
    private static void show02() {
        File f1 = new File("/Users/hankun/Desktop/javaBegin/firstDemo/README.md");
        String p1 = f1.getPath();
        System.out.println(p1);

        File f2 = new File("/src/com/carrsk/Demo05File/demo01File/Demo03FileGet.java");
        String path = f2.getPath();
        System.out.println(path);
    }

    /**
     *   getAbsolutePath(); 返回File类的绝对路径字符串
     */
    private static void show01() {
        File f1 = new File("/Users/hankun/Desktop/javaBegin/firstDemo/README.md");
        String absolutePath = f1.getAbsolutePath();
        System.out.println(absolutePath);

        File f2 = new File("/README.md");
        String absolutePath1 = f2.getAbsolutePath();
        System.out.println(absolutePath1);
    }
}
