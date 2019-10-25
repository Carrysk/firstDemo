package com.carrysk.Demo06IOAndProperties.Demo08Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * java.lang.Writer 是所有字符输出流的最顶级的父类，是一个抽象类
 *   共性成员方法
 *     void write(int c)
 *     void write(char[] cbuf)
 *     abstract wirte(char[] cbuf, int offset, int length)
 *     void write(String str, int off, int length)
 *     void flush() 刷新该流的缓冲 ** 程序可继续使用
 *     void close() 刷新该流后，关闭此流  ** 流不可继续使用
 *
 *  java.lang.FileWriter extends OutputStreamWriter extends Writer
 *  FileWriter 文件输出流 作用 -》 把内存中的字符数据写入到文件中
 *    构造方法
 *       FileWriter(File file)
 *       FileWriter(String name)
 *       FileWriter(File file, Boolean append)
 *       FileWriter(String name, Boolean append)
 *
 *    使用
 *      1 创建FileWriter对象
 *      2 write字符
 *      3 flush 刷新缓冲
 *      4 释放资源
 */
public class Demo01FileWriter {
    public static void main(String[] args) throws IOException {

        //1 创建FileWriter对象
        FileWriter fw = new FileWriter("./out/a.txt");

        //2 write字符
        fw.write(97);

        //3 flush 刷新缓冲
        fw.flush();

        //4 释放资源
        fw.close();
    }
}
