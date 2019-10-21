package com.carrysk.Demo05File.demo01File;

import java.io.File;

/**
 * 相对路径和 绝对路径
 *   绝对路径是相对于盘符的，
 *   相对路径是相对于当前文件的
 *        当前文件在c:/filename  1.txt用绝对路径表示就是  c:/filename/1.txt
 *                                   用相对路径表示就是 1.txt
 * 注意 路径不区分大小写
 *    windows 路径使用反斜杠，需要转义// -》》  /
 *
 *  File 的构造方法
 *     File(String path)
 *     File(String parent, String child)
 *     FIle(File parent, String child)
 */

public class Demo02FilePath {

    public static void main(String[] args) {
        show03();
    }

    /**
     * File(File parent, String child)
     * File parent 父路径对象
     * String child 子路径
     */
    private static void show03() {
        File parent = new File("~/");
        File desktop = new File(parent, "Desktop");
        System.out.println(desktop);
    }

    /**
     * File(String parent, String child)
     *   String parent 父路径
     *   Strin child 子路径
     */
    private static void show02() {
        File desktop = new File("~/", "Desktop");
        System.out.println(desktop);
    }

    /**
     * File(String path) 传递一个路径进去
     */
    private static void show01() {
        File file = new File("~/Desktop");
        System.out.println(file);
    }


}
