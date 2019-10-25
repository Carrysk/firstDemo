package com.carrysk.Demo06IOAndProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream
 *    int read(byte[] b)
 *     方法的参数 byte[] 的作用是 起到缓冲作用 存储每次读取到的多个字节
 *                             数组的长度一般定义为1024 -》 1kb 或1kb的倍数
 *     方法的返回值 是 每次读取的有效字节长度
 *
 * String 类的构造方法
 *   String(byte[] bytes) 把字节数组转化为字符串
 *   String(byte[] bytes, int offset, int length) 把字节数组的一部分转化为字符 offset 开始索引 length 转化的长度
 */
public class Demo05InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("./a.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while((len = fis.read(bytes)) != -1) {
            System.out.println(len);
            System.out.println(new String(bytes, 0, len));
        }
    }
}
