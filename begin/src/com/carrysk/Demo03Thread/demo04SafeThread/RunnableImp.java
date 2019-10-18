package com.carrysk.Demo03Thread.demo04SafeThread;

/**
 * 定义接口实现类模拟抢票软件
 * 共同访问数据 如何安全访问
 */
public class RunnableImp implements Runnable {

    // 总共一百张票
    private int tickets = 100;

    @Override
    public void run() {
        //消耗票
        while (tickets > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "出售类第" + tickets-- + "张票");
        }
    }
}
