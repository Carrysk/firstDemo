package com.carrysk.Demo06IOAndProperties;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * 实现换行和 继续写
 * new FileOutputStream(File file, Boolean append)
 *   append：true 继续写
 *           false 覆盖重写
 * 换行实现
 *  window \r\n
 *  linux \n
 *  mac \r
 */
public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {

        // 创建一个文件输出流对象
        FileOutputStream fos = new FileOutputStream(new File("./a.txt"), true);

        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r".getBytes());
        }

        // 释放资源（流使用会占用一定的内存，使用完毕要把内存清空，提供程序的效率）
        fos.close();
    }
}
