package com.carrysk.Demo08FunctionalInterface.Demo06Function;

import java.util.function.Function;

/**
 * java.util.function.Function
 * 有一个默认方法 andThen
 * 连接两个 Function接口对象
 */
public class Demo01FunctionDefaultFunction {

    public static void main(String[] args) {

        String target = "123";

        changeVal(
                target,
                str -> Integer.parseInt(str),
                num -> num += 333,
                num -> num + ""
        );
    }

    /**
     * 定义一个方法 使用andThen 连接两个Function，转化
     * "123" 转化为 456
     * "123" -》 123
     * 123 -> 456
     * 456 -> "456"
     */
    public static void changeVal(
            String target,
            Function<String, Integer> fun1,
            Function<Integer, Integer> fun2,
            Function<Integer, String> fun3
    ) {
        String res = fun1.andThen(fun2).andThen(fun3).apply(target);
        System.out.println(res);
    }
}
