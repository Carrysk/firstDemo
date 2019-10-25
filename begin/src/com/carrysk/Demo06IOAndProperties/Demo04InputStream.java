package com.carrysk.Demo06IOAndProperties;

import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * InputStream 定义了所有子类共性的方法
 *   int read() 从输入流中读取数据到的下一个字节
 *   int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数据b中
 *   void close() 关闭输入流并释放与该流关联的所有系统资源
 *
 *   java.io.FileInputStream extends InputStream
 *   FileInputStream 把硬盘文件中的数据，读取到内存中使用
 *   构造方法
 *      FileInputStream(String name)
 *      FileInputStream(File file)
 *      参数 读取文件的数据流
 *        String name 文件的路径
 *        File file 文件对象
 *       构造方法的作用
 *         会创建一个FileInputStream对象
 *         会把FileInputStream对象指定构造方法中要读取的文件读取
 *   读取数据的原理（硬盘-》内存）
 *    java程序 -》 JVM —》 os -》 os读取数据的方法 —》 读取文件
 *   字节输入流的使用步骤（重点）：
 *      1 创建一个字节输入流的对象
 *      2 read方法
 *      3 close 释放系统资源
 */
public class Demo04InputStream {
    public static void main(String[] args) throws IOException {
        // 创建文件 并输出
        FileOutputStream fos = new FileOutputStream(new File("./a.txt"));
        fos.write("abc你好".getBytes());
        fos.close();

        // 读取文件 输入并打印
        FileInputStream fis = new FileInputStream(new File("./a.txt"));

        int len; // 读取的是字节
        while ((len = fis.read()) != -1){
//            System.out.print(len);
            System.out.print((char)len); // 转化为字符 打印出来
        }
        fis.close();

    }

}
