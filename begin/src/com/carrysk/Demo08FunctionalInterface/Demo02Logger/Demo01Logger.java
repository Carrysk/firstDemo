package com.carrysk.Demo08FunctionalInterface.Demo02Logger;

/**
 * 不使用lambda表达式
 *  打印日志会造成浪费
 *    如果level不等于1 就不会打印msg
 *      也就是说 做了额外的链接字符串的操作 浪费！！！
 *      Demo02使用lambda 优化logger
 */
public class Demo01Logger {
    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "!!!";
        show01(1, msg1 + msg2 + msg3);
    }

    private static void show01(int level, String msg) {
        if (level == 1)
            System.out.println(msg);
    }
}

