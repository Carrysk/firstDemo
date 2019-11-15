package com.carrysk.Demo09StreamAndMethodReference.demo03FunctionReference.Demo04ArrayRef;

/**
 * 创建一个返回值为整型数组的接口
 */
@FunctionalInterface
public interface ArrayMaker {
    int[] make(int n);
}
