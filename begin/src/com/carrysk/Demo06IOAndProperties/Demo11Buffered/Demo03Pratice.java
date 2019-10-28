package com.carrysk.Demo06IOAndProperties.Demo11Buffered;

import java.io.*;

/**
 * 一读一写 复制一个文件
 */
public class Demo03Pratice {
    public static void main(String[] args) throws IOException {
        long begin = System.currentTimeMillis();

        // 创建输入流
        FileInputStream fis = new FileInputStream("./out/a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        // 创建输出流
        FileOutputStream fos = new FileOutputStream("./out/c.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        // 执行读写操作
        int len = -1;
//        while (-1 != (len = bis.read())){
//            bos.write(len);
//        }
        byte[] b = new byte[1024];
        while( -1 != (len = bis.read(b))) {
            bos.write(b);
        }


        // 释放资源
        bos.close();
        bis.close();

        long end = System.currentTimeMillis();
        System.out.println(end - begin + " 毫秒"); // 单个读取 1ms 读取1024个 0ms
    }
}
