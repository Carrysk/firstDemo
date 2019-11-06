package com.carrysk.Demo08FunctionalInterface.Demo04Consumer;

import java.util.function.Consumer;

/**
 *  使用andThen 练习
 *  消费一个数组 按照规则打印
 */
public class Demo03AndThenPratice {

    public static void main(String[] args) {
        String[] arr = {"迪丽热巴:女", "玛尔扎哈:怪兽"};

        printInfo(arr, (String info)->{
            String name = info.split(":")[0];
            System.out.printf(name + " ");
        }, (String info)->{
            String sex = info.split(":")[1];
            System.out.println(sex + ";");
        });
    }

    // 传递一个数组 使用andThen 消费
    public static void printInfo(String[] strArr, Consumer<String> con1, Consumer<String> con2) {
        for (String s : strArr) {
            con1.andThen(con2).accept(s);
        }
    }
}
