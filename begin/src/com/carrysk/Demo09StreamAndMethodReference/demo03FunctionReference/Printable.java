package com.carrysk.Demo09StreamAndMethodReference.demo03FunctionReference;

/**
 * 定义一个打印的函数型接口
 */

@FunctionalInterface
public interface Printable {
    void print(String s); // 参数s
}
