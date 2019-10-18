package com.carrysk.Demo03Thread.demo09WaitAndNotify;

/**
 * 唤醒和等待
 *
 * Object 对象
 *    void wait() 进入Waiting
 *    void notify() 环境
 *
 * 实现 买家线程买包子（消费者）
 *     卖家线程卖包子（生产者）
 *
 *
 */


public class ThreadStatusDemo  {
    public static void main(String[] args) {
        // 1 创建锁
        Object l = new Object();

        // 2 创建买家（消费者）
        new Thread() {
            @Override
            public void run() {
                while(true) {
                    synchronized (l) {
                        System.out.println("买家卖包子了，等待卖家做好包子");
                        try {
                            l.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        // notify 结束后 线程执行wait后的代码
                        System.out.println("吃包子了！！！");
                        System.out.println("next one --------------");
                    }
                }
            }
        }.start();

        // 3 创建卖家(生产者）
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    System.out.println("卖家正在做包子");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (l) {
                        System.out.println("包子做好了");
                        l.notify();
                    }
                }
            }
        }.start();
    }
}
