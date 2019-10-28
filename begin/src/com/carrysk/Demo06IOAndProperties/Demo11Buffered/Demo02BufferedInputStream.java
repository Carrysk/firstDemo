package com.carrysk.Demo06IOAndProperties.Demo11Buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * java.io.BufferedInputStream extend InputStream
 * <p>
 * 1 创建字节输入流对象
 * 2 创建缓冲输入流对象
 * 3 读取字节
 * 4 释放资源1
 */
public class Demo02BufferedInputStream {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("./out/a.txt");

        BufferedInputStream bis = new BufferedInputStream(fis);

        int len = 0; // 每次读取的有效字节
        while (-1 != (len = bis.read())) {
            System.out.println(len);
        }

        bis.close();  // close后 fix自动释放
    }
}
