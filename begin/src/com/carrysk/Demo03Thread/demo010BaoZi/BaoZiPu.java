package com.carrysk.Demo03Thread.demo010BaoZi;

/**
 * 包子铺 是生产者
 * 启动包子铺线程，锁对象是包子
 * 如果包子的flag 为true 有包子 false 没有包子
 */
public class BaoZiPu extends Thread {
    private BaoZi baozi;

    public BaoZiPu(BaoZi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "启动了");
        int count = 0; // 定义 单数包子 偶数包子
        while (true) {
            synchronized (baozi) {
                if (baozi.getFlag()) {
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // count 单数薄皮 偶数厚皮
                if (count % 2 == 1) {
                    baozi.setPi("薄皮");
                    baozi.setXian("牛肉大葱");
                } else {
                    baozi.setPi("厚皮");
                    baozi.setXian("韭菜豆腐");
                }
                baozi.setFlag(true);
                count++;
                System.out.println("正在做" + baozi.getPi() + baozi.getXian() + "包子");
                // 做包子耗时间
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("包子出锅啦");
                baozi.notify();
            }
        }
    }
}
