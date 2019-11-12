package com.carrysk.Demo08FunctionalInterface.Demo05Predicate;

import java.util.function.Predicate;

/**
 * java.util.function.Predicate
 *   作用 对某种数据类型的数据进行判断，结果返回一个boolean值
 *
 *   Predicate 接口中包含一个抽象的方法
 *     boolean test(T t) 用来对指定数据类型进行判断的方法
 *       结果返回 true/false
 */
public class Demo01Predicate {
    /**
     *
     *  定义一个方法
     *   参数传递一个字符串，
     *   传递一个Predicate接口，泛型使用String
     *   使用Predicate 进行判断， 返回判断结果
     */
    public static boolean checkString(String str, Predicate<String> pre) {
        return pre.test(str);
    }

    public static void main(String[] args) {

        // 1 定义一个字符串
        String s = "123";

        // 2 use checkString funciton
        /*boolean b = checkString(s, (String str) -> {
            return str.length() > 5;
        });*/

        boolean b = checkString(s, str -> str.length() < 5);

        System.out.println(b);
    }
}
