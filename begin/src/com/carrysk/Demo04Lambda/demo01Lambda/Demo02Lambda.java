package com.carrysk.Demo04Lambda.demo01Lambda;

/**
 * 自己实现一个无参 无返回值的接口的方法 使用lambda表达式简化书写
 *
 * 1 定义Cook 接口 定义makeFood方法
 * 2 定义一个方法接收Cook接口的实现类
 * 3 调用Cook接口的makeFood方法
 */
public class Demo02Lambda {
    public static void main(String[] args) {
        // 使用匿名内部类实现
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭11111");
            }
        });

        // 使用lambda表达式
        invokeCook(()->{
            System.out.println("吃饭222222");
        });
    }

    // 2 定义方法接收Cook接口 并调用makeFood方法
    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}


// 1 定义Cook接口
interface Cook {
    public abstract void makeFood();
}