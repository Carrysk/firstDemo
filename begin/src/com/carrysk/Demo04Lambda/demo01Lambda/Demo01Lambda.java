package com.carrysk.Demo04Lambda.demo01Lambda;

/**
 * lambda 表达式的标准格式
 *   由三部分组成
 *    a 参数列表
 *    b 一个箭头（类似ES6 箭头函数）
 *    c 一段代码
 *    格式如下
 *      (参数列表) -> {一段代码}
 *
 *    解释说明
 *      （） 接口中抽象方法的参数列表 没有参数 就空着， 有参数就写出参数 多个参数用逗号隔开
 *      -> 传递的意思 将参数列表中的参数 传递给方法体
 *      {} 重写接口中的抽象方法
 */

public class Demo01Lambda {
    public static void main(String[] args) {

        // 对比实现线程启动

        // 1 匿名内部类实现
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " 匿名内部类线程启动");
            }
        }).start();

        // 2 使用lambda表达式实现
        new Thread(()->{
            System.out.println(Thread.currentThread().getName() + " lambda线程启动了！！");
        }).start();
    }
}
