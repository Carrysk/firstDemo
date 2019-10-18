package com.carrysk.Demo03Thread.demo08Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题的第三种方法 使用锁Lock
 * java.util.concurrent.lock
 * void lock() 锁
 * void unLock() 解锁
 * 使用方法
 * 1 创建锁对象
 * 2 在可能发生安全问题的代码块钱上锁
 * 3 在代码结束后解锁
 */
public class RunnableImp implements Runnable {

    // 总共一百张票
    private static int tickets = 100;

    // 1 创建锁对象
    private Lock l = new ReentrantLock();

    /**
     * 最优写法 将解锁机制放在finnaly关键字中， 无论异常与否 都需要解锁
     */
    @Override
    public void run() {
        //消耗票
        while (true) {

            // 2 上锁
            l.lock();
            if (tickets > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "出售类第" + tickets + "张票");
                    tickets--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {

                    // 3 解锁
                    l.unlock();
                }

            }

        }
    }

//    @Override
//    public void run() {
//        //消耗票
//        while (true) {
//
//            // 2 上锁
//            l.lock();
//            if (tickets > 0) {
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "出售类第" + tickets + "张票");
//                tickets--;
//            }
//
//            // 3 解锁
//            l.unlock();
//        }
//    }

}
