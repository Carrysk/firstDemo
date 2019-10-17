package com.carrysk.Demo03Thread.demo02Runable;

/**
 * 使用Runnable接口创建线程
 * Runnable 没有start方法需使用Thread类的Start方法
 *      public Thread(Runnable run) {}
 *
 * 1 创建类实现Runnable接口
 * 2 创建接口的实现类
 * 3 调用Thread(接口实现类对象）
 * 4 start
 *
 *      实现Runnable接口创建多线程程序的好处
 *          1 避免类单继承的局限性
 *            一个类只能继承一个类，类继承类Thread类就不能继承其他的类
 *            实现了Runnable接口，还可以继承其他的类，实现其他的接口
 *          2 增强了程序的扩展性，降低了程序的耦合性（解偶）
 *              实现了Runnable接口，吧设置线程任务和启动新线程进行了分离（解耦）
 *              在实现类中，重写了run方法，用来设置线程任务
 *              创建Thread类对象，调用了start方法用来开启新线程
 */

public class Demo01RunableMain  {
    public static void main(String[] args) {
        Runnable run = new Demo01Runable();
        Thread td = new Thread(run);
        td.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "-->>" + i);
        }
    }

}
