package com.carrysk.Demo08FunctionalInterface.Demo03Supplier;

import com.sun.jdi.IntegerType;

import java.util.function.Supplier;

/**
 * 求数组元素的最大值
 */
public class Demo02SupplierGetMax {
    // 定义一个方法 用于获取int类型数组中元素的最大值 方法的参数传递Supplier接口， 泛型使用Integer
    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        // 定义一个数组
        int[] num = {1, 2, 55, 33, 65, 99};

        int maxNum = getMax(()->{
            int max = num[0];
            for (int i = 1; i < num.length; i++) {
                if (num[i] > max) {
                    max = num[i];
                }
            }

            return max;
        });
        System.out.println(maxNum);
    }
}
