package com.carrysk.Demo09StreamAndMethodReference.demo01Stream;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * 使用for循环遍历一个list
 * 目的 比较 for循环和Stream流
 * for循环是遍历的方式
 * Stream 关注于目的（做什么），而不是怎么做
 *    filter(Predicate)  判断
 *    forEach(Consumer) 消费
 */
public class Demo01Stream {
    public static void main(String[] args) {
        // 1 create ArrayList
        ArrayList<String> list = new ArrayList<>();
        // 2 add
        list.add("张无忌");
        list.add("张三丰");
        list.add("张二");
        list.add("周芷若");

        // 3 length == 3
        // 4 StartWith("张")
        // 5 输出
        list.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return s.length() == 3;
                    }
                })
                .filter(name -> name.startsWith("张"))
                .forEach(name -> System.out.println(name));
    }
}
