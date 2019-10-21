package com.carrysk.Demo05File.demo01File;

import java.io.File;

/**
 * File 中的一些静态变量
 *   由于Windows 和 linux 中一些路径表示的符号不同 java.io.File中定义了一些静态变量供使用
 */
public class Demo01Begin    {
    public static void main(String[] args) {
        // 1 路径间隔符号 window; linux:
        char pathSeparatorChar = File.pathSeparatorChar;
        System.out.println(pathSeparatorChar); // : 由于系统是macOS 是基于unix

        // 2 分割符 windows \ linux /
        String separator = File.separator;
        System.out.println(separator); //  /

    }
}
