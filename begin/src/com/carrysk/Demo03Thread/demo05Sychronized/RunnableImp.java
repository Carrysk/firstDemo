package com.carrysk.Demo03Thread.demo05Sychronized;

/**
 * 定义接口实现类模拟抢票软件
 * 共同访问数据 如何安全访问
 *
 * 使用锁机制 将要保护的对象锁起来
 *      多个线程需要使用同一个锁
 *      sychronized(锁对象）{要保护的数据}
 */
public class RunnableImp implements Runnable {

    // 总共一百张票
    private int tickets = 100;

    private Object obj = new Object(); // 锁

    @Override
    public void run() {
        //消耗票
        while (true) {
            synchronized (obj) { // 定义锁对象 仅让一个线程在同步锁中运行
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "出售类第" + tickets-- + "张票");
                }
            }
        }
    }
}
