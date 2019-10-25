package com.carrysk.Demo06IOAndProperties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 练习
 *  读取文件 拷贝到另一个文件
 *   1 创建一个输入流
 *   2 创建一个输出流
 *   3 读取输入流 传递给输出流
 *   4 关闭
 */
public class Demo06Pratice {
    public static void main(String[] args) throws IOException {
        //1 创建输入流对象
        FileInputStream fis = new FileInputStream("./a.txt");
        // 2 创建输出流对象
        FileOutputStream fos = new FileOutputStream("./out/a.txt");

        byte[] b = new byte[1024];
        int len = -1;
        // 3 输入 输出
       /* while(-1 !=  (len = fis.read(b))){
            fos.write(b, 0 ,len);
        }*/
       int sb;
       while(-1 != (sb =fis.read())) {
           fos.write(sb);
       }

        // 4 关闭
        fos.close();
        fis.close();

    }
}
