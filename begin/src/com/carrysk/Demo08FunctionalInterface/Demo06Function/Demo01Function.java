package com.carrysk.Demo08FunctionalInterface.Demo06Function;

import java.util.function.Function;

/**
 * java.util.function.Function
 * 接口根据一种转换类型， 将一个类型转化为另一个泛型
 * Function<T, R>
 * R apply(T t)
 */
public class Demo01Function {
    public static void main(String[] args) {
        // 使用定义的方法 将一个字符串转化为数字
        String str1 = "123";

        changeFun(str1, str -> Integer.parseInt(str));
    }

    /**
     * 创建一个方法 将String 转化为Integer
     */
    public static void changeFun(String str, Function<String, Integer> fun1) {
        System.out.println(fun1.apply(str));
    }
}
