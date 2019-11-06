package com.carrysk.Demo08FunctionalInterface.Demo04Consumer;

import java.util.function.Consumer;

/**
 * java.util.function.Consumer 接口 是一个消费型接口
 *  他不是生产一个数据， 而是消费一个数据，其数据类型由泛型决定
 *  Consumer 接口中 void accept(T t) {} 意为消费一个指定泛型的数据
 *
 *  至于怎么消费（使用）， 需要自定义。。。
 */
public class Demo01Consumer {

    // 定义一个方法 参数为String name, Consumer<String>
    public static void nameConsumer(String name, Consumer<String> consumer) {
        consumer.accept(name);
    }

    public static void main(String[] args) {

        String name = "zhangsan";
        nameConsumer(name, (String str)->{
            // 直接输出字符串
            System.out.println(str);

            // 字符串反转
            String s = new StringBuffer(str).reverse().toString();
            System.out.println(s);

        });
    }
}
