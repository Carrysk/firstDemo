package com.carrysk.Demo06IOAndProperties;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java.io.FileOutputStream
 *   FileOutputStream(String name)
 *   FileOutputStream(File file)
 *   参数 写入数据的目的
 *        String name 目的是一个文件的路径
 *        File file 目的是一个文件
 *   构造方法的作用
 *       1 创建一个FileOutputStream对象
 *       2 会根据构造方法中传递的文件/文件路径，创建一个空的文件
 *       3 会把FileOutputStream对象指向创建好的文件
 *
 * 写入数据的原理（内存-》硬盘）
 *   java程序-》jvm-》os（操作系统）-》os调用写数据的方法-》把数据写入
 *
 *字节输出流的使用步骤（重点）：
 *   1 创建一个FileOutput
 */
public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {

        // 创建一个文件输出流对象
        FileOutputStream fos = new FileOutputStream("./a.txt");

        // public abstract void write(int num) 写入字节
        fos.write(123);

        // 释放资源（流使用会占用一定的内存，使用完毕要把内存清空，提供程序的效率）
        fos.close();
    }
}
