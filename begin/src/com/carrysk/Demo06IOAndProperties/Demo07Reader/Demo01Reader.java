package com.carrysk.Demo06IOAndProperties.Demo07Reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * Reader(抽象类) 专门用来读字符的（无论中英文，按照字符读取）
 *    UTF8 中文 3个字节
 *    GBK 中文 2 个字节
 *    int read 读取单个字符并返回
 *    int read(char[] cbuf) 一次读取多个字符，返回有效字符的长度
 *    void close 关闭流 释放资源
 *
 * FileReader
 *   java.io.FileReader extends InputStreamReader extends Reader
 * 作用： 把磁盘中的数据以字符的形式读取到内存中
 *   构造方法
 *     FileReader(File file)
 *     FileReader(String name);
 *     参数 读取文件的数据源
 *         File file 读取的文件对象
 *         String name 读取的文件路径
 *     FileReader构造函数作用 1 创建一个FileReader对象 2 会把FileReader对象指向要读取的文件
 *
 *     字符输入流的使用步骤
 *        1 创建输入流对象
 *        2 使用read方法读取文件
 *        3 释放资源
 *
 *     String 对象的构造方法
 *     String(char[] chars) 返回字符串
 *     String(char[] chars, int offset, int length) 返回字符串
 */
public class Demo01Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./a.txt");

        // 读取单个字符
        /*int len = -1;
        while(-1 != (len = fr.read())) { // 当前字符的编码
            System.out.print(len);
        }*/

        // 读取多个
        char[] chars = new char[1024];
        int len = -1;
        while (-1 != (len = fr.read(chars))){  // len 返回有效字符的个数
            System.out.print(new String(chars, 0, len));
        }
        fr.close();
    }
}
