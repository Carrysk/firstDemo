package com.carrysk.Demo03Thread.demo01Thread;

/**
 * static void sleep(long mills) {} 线程休眠
 */
public class ThreadSleep {
    public static void main(String[] args) {
        for (int i = 0; i < 60; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
