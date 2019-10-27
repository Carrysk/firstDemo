package com.carrysk.Demo06IOAndProperties.Demo11Buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java.io.BufferedOutputStream extends OutputStream
 *  BufferedOutputStream 字节缓冲输出流
 *
 *  继承的方法
 *     public void close()
 *     public void flush()
 *     public void write(byte[] b)
 *     public void write(byte[] b, int offset, int length)
 *     public abstract void write(int b) 将指定字节输出
 * 构造方法
 *     BufferedOutputStream(OutputStream os) 创建一个新的缓冲输出流，将数据写入指定的底层输出流
 *     BufferedOutputSteam(OutputStream os, int size) 创建一个新的缓冲输出流，将以具体的缓冲区大小的数据写入指定的底层输出流
 *     参数
 *        OutputStream os 字节输出流
 *            可以传递FileOutStream，缓冲流会给FileOutputStream增加一个缓冲区，提高FileOutPutStream的写入效率
 *
 *        int size 指定缓冲流内的缓冲区大小，不指定默认
 *  使用步骤
 *     1 创建字节输出流，构造方法绑定要输出的目的地
 *     2 创建缓冲字节输出流
 *     3 使用BufferedOutputStream write 写入缓冲区中
 *     4 flush
 *     5 close（释放资源） 首先会flush 再关闭流
 */

public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        // 1 创建字节输入流
        FileOutputStream fos = new FileOutputStream("./out/a.txt");

        // 2 创建缓冲字节输出流
        BufferedOutputStream bis = new BufferedOutputStream(fos);

        // 3 写
        bis.write("今天天气不错，最高气温19摄氏度".getBytes());

        // 4 flush
        bis.flush();

        // 5 释放资源
        bis.close();
        fos.close();
    }
}
