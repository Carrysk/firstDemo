package com.carrysk.Demo06IOAndProperties.Demo12Charset;

import java.io.*;

/**
 * java.io.InputStreamReader extends Reader
 * java.io.OutputStreamWriter extends Writer
 *
 * 构造方法
 *   InputStreamReader(File file, String charset)
 *   OutputStreamWriter(File file, String charset)
 *   参数
 *       charset 指定 目标的编码格式  GBK UTF8 默认UTF8
 *       File 文件对象
 * 练习 读取GBK文件 转化为UTF-8文件
 *     步骤
 *        1 创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称charset
 *        2 创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码标名称charset
 *        3 使用InputStreamReader中的read方法读取文件
 *        4 将读取的文件使用OutputStreamWriter中writer方法写如文件中
 *        5 释放资源
 */
public class Demo01Pratice {
    public static void main(String[] args) throws IOException {
        //1 创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称charset
        InputStreamReader isr = new InputStreamReader(new FileInputStream("./out/a.txt"), "UTF-8");
        //2 创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码标名称charset
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("./out/b.txt"), "GBK");
        //3 使用InputStreamReader中的read方法读取文件
        int len = -1;
        while ((len = isr.read()) != -1) {
        //4 将读取的文件使用OutputStreamWriter中writer方法写如文件中
            osw.write(len);
        }
        //5 释放资源
        osw.close();
        isr.close();
    }
}
