package com.carrysk.Demo03Thread.demo01Thread;

/**
 * Thread api
 *        String getName() 返回当前线程的名字 //Thread-0 Thread-1 main....
 *        static Thread currentThread() 返回当前线程的对象引用
 */


public class ThreadGetName extends Thread  {
    @Override
    public void run() {
        String name = getName();
        System.out.println(name);
    }

    public static void main(String[] args) {
        ThreadGetName thread = new ThreadGetName();
        thread.run(); // Thread-0

        // 输出主线程名字
        new ThreadGetName().run(); //Thread-1

        String name = Thread.currentThread().getName();
        System.out.println(name); //main
    }
}
