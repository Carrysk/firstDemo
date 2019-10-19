package com.carrysk.Demo03Thread.demo011ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 *
 * 使用方法
 *     1 使用线程池的工厂类Executors 中的静态方法newFixedThreadPool创建一个指定线程数量的线程池
 *     2 创建一个类 实现Runnable接口，重写run方法，设置线程任务
 *     3 调用ExecutorService中的方法submit，传递线程任务（Runnable接口实现类对象），开启线程，执行run方法
 *     4 调用ExecutorService中的方法shutdown销毁线程池（一般不使用）
 */


public class ThreadPool  {
    public static void main(String[] args) {
        // 1 创建一个指定大小的线程池
        ExecutorService es = Executors.newFixedThreadPool(2); // 创建一个两个线程的线程池

        // 3 调用ExecutorService中的submit方法 开启任务
        es.submit(new RunnableImp()); // pool-1-thread-1 启动了
        es.submit(new RunnableImp());
        es.submit(new RunnableImp());
        es.submit(new RunnableImp());

        es.shutdown();  // 销毁线程池
        es.submit(new RunnableImp());  // java.util.concurrent.RejectedExecutionException
    }
}
