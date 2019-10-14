package com.carrysk.Demo02Exception.dealException;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * fun2 使用try{}catch(){}处理异常
 * 使用：
 * try 中 放置可能会抛出异常的语句
 * catch（Exceptin e） {} 捕获发生异常的情况
 * <p>
 * 使用 Throwable接口打印出 异常的相关信息
 * e.toString() // 打印出异常的信息
 * e.getMessage() // 打印出异常的完整信息
 * e.printStackTrace(); // 打印出完整的异常信息来源
 */

public class Demo02TryCatch {

    public static void main(String[] args) {
        try {
            readFile("~/Desktop/1.txtt");
        } catch (Exception e) {
            System.out.println("捕获到异常啦  ");
            // System.out.println(e.getMessage()); // 文件后缀不正确，~/Desktop/1.txtt
            // System.out.println(e.toString()); // java.io.IOException: 文件后缀不正确，~/Desktop/1.txtt

            e.printStackTrace();
            /*
                java.io.IOException: 文件后缀不正确，~/Desktop/1.txtt
                    at com.carrysk.Demo02Exception.dealException.Demo02TryCatch.readFile(Demo02TryCatch.java:41)
                    at com.carrysk.Demo02Exception.dealException.Demo02TryCatch.main(Demo02TryCatch.java:23)
             */
        }

        System.out.println("异常后的语句");
    }

    private static void readFile(String s) throws IOException {
        if (!s.equals("~/Desktop/1.txtt")) {
            throw new FileNotFoundException("~/Desktop/1.txt未找到 ");
        }
        if (!s.endsWith(".txt")) {
            throw new IOException("文件后缀不正确，" + s);
        }
        System.out.println("找到文件，无异常情况");
    }
}
