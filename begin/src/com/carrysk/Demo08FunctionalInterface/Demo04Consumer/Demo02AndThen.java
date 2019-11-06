package com.carrysk.Demo08FunctionalInterface.Demo04Consumer;

import java.util.function.Consumer;

/**
 * Consumer 接口的默认方法andThen 连接两个Consumer接口 参数返回一个新的Consumer
 * 作用需要两个Consumer接口，可以把两个Consumer接口组合到一起，在对数据进行消费
 * <p>
 * 连接两个Consumer接口 谁在前谁消费
 */
public class Demo02AndThen {

    // 定义一个方法 方法参数传递一个字符串和两个consumer接口， consumer接口的泛型使用字符串
    public static void method(String name, Consumer<String> con1, Consumer<String> con2) {
        // 1 分别消费
        /*con1.accept(name);
        con2.accept(name);*/

        // 2 andThen
        con1.andThen(con2).accept(name);
    }

    public static void main(String[] args) {
        String name = "AbC";

        method(name, (String str1) -> {
            System.out.println(str1.toLowerCase());
        }, (String str2) -> {
            System.out.println(str2.toUpperCase());
        });
    }
}
