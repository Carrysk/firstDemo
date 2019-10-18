package com.carrysk.Demo03Thread.demo07StaticSychronized;

/**
 * 解决线程安全问题的第二种方法 使用同步方法
 * public sychronized void fun1() {}
 * 同步方法的实现原理 也是同步代码块
 * 只不过当前的锁是this 也就是Runnable接口实现类
 */
public class RunnableImp implements Runnable {

    // 总共一百张票
    private static int tickets =100;

    @Override
    public void run() {
        //消耗票
        System.out.println("this:" + this);
        while (true) {
            sellTickets();
        }
    }

    /**
     * 创建静态的同步方法完成共享数据的保护
     * 静态同步方法的锁对象不是本身this 而是 类(RunnableImp.class)
     */
    public static /*synchronized*/ void sellTickets() {
        synchronized (RunnableImp.class) {
            if (tickets > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "出售类第" + tickets + "张票");
                tickets--;
            }
        }
    }

}
