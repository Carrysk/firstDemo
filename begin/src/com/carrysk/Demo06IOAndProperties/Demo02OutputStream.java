package com.carrysk.Demo06IOAndProperties;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 *  public abstract write(byte[] b) 将byte[] b 写入文件
 *  public abstrack write(byte[] b, int begin, int len); begin 就是开始下标 len 是写的长度
 *
 *  注意 字节在0～128之间是ascall 之外是系统默认的码表 一个负数加一个数 组成中文
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {

        // 创建一个文件输出流对象
        FileOutputStream fos = new FileOutputStream(new File("./a.txt"));

        // public abstract void write(int num) 写入字节
//        fos.write(123);

        byte[] bytes1 = {67, 62, 63, 64};
        fos.write(bytes1); // C>?@

        byte[] bytes2 = {32,33,34,35,36};
        fos.write(bytes2, 1, 3);  // !"#

        // 使用String 转化为字节
        byte[] bytes = "你好啊，我是天才昆".getBytes();
        System.out.println(Arrays.toString(bytes));
        fos.write(bytes);

        // 释放资源（流使用会占用一定的内存，使用完毕要把内存清空，提供程序的效率）
        fos.close();
    }
}
