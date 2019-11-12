package com.carrysk.Demo09StreamAndMethodReference.demo01Stream;

import java.util.ArrayList;

/**
 * 使用for循环遍历一个list
 * 目的 比较 for循环和Stream流
 * for循环是遍历的方式
 * Stream 关注于目的
 */
public class Demo01List {
    public static void main(String[] args) {
        // 1 create ArrayList
        ArrayList<String> list = new ArrayList<>();
        // 2 add
        list.add("张无忌");
        list.add("张三丰");
        list.add("张二");
        list.add("周芷若");

        // 3 length == 3
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list) {
            if (s.length() == 3) {
                list2.add(s);
            }
        }

        // 4 StartWith("张")
        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if (s.startsWith("张")) {
                list3.add(s);
            }
        }

        // 5 输出
        for (String s : list3) {
            System.out.println(s);
        }
    }
}
