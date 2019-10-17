package com.carrysk.Demo03Thread.demo01Thread;

public class ThreadSetNameMain {
    public static void main(String[] args) {

        // 1 通过setName 设置线程的名字
        ThreadSetName ts = new ThreadSetName();
        ts.setName("ahahha");
        ts.start(); // 启动线程使用start 方法 而不是 run方法

        // 2  通过构造函数设置线程的名字
        new ThreadSetName("lalalala").start();
    }
}
