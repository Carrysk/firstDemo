package com.carrysk.Demo08FunctionalInterface.Demo03Supplier;


import java.util.function.Supplier;

/**
 * java.util.function.Supplier
 *   接口仅包含一个无参的方法 用来获取一个泛型参数指定的返回值
 *
 *   Supplier<T> 生产型接口， 指定接口的泛型是什么，那么接口中的get方法就生产什么类型的数据
 *
 */
public class Demo01Supplier {

    // 定义一个方法 方法的参数传递Supplier<T>接口 泛型执行String， get方法返回什么类型的数据
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        // 调用getString 方法 方法的参数是一个函数式接口，可以传递lambda表达式
        System.out.println(getString(() -> "范冰冰"));
    }
}
