package com.carrysk.Demo03Thread.demo02Runable;

/**
 * Java.lang.Runnable
 * 实现Runnable接口，并重写run方法
 */
public class Demo01Runable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
