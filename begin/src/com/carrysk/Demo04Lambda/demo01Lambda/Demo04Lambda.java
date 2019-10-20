package com.carrysk.Demo04Lambda.demo01Lambda;

/**
 * 自定义带参数带返回值的lambda表达式
 * <p>
 * exp 定义一个Calculator接口
 * 定一个接收参数的方法calc 返回参数的和
 * 使用lambda表达式简化实现
 *
 * lambda表达式简化的前提
 *   1 使用lambda必须具有接口，且要求接口中有且仅有一个抽象方法。无论是JDK内置的Runnable、Compatrator接口还是自定义的接口，只有当接口中的抽象方法存在且唯一时，才可以使用Lambda
 *   2 使用lambda必须具有 上下文推断
 *     也就是方法的参数或局部变量类型必须为lambda对应接口类型，才能使用lambda作为该接口的实例
 *     exp invokeCalc(int num1, int num2, Calculator c) { int res = c.calc(num1,num2);}
 *         interface Calculator { public int calc(int num1, int num2) { return num1+ num2}}
 */
public class Demo04Lambda {
    public static void main(String[] args) {
        // 使用匿名内部类实现
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int num1, int num2) {
                return num1 + num2;
            }
        });

        // lambda表达式 简化后
        invokeCalc(100, 200, (num1, num2) -> {
            return num1 + num2;
        });

        // 简化lambda表达式
        invokeCalc(1000, 2000, (num1, num2) -> num1 + num2);

    }

    public static void invokeCalc(int num1, int num2, Calculator c) {
        int res = c.calc(num1, num2);

        System.out.println(res);
    }
}

// 1 定义Calculator接口
interface Calculator {
    public abstract int calc(int num1, int num2);
}