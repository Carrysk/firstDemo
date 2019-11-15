package com.carrysk.Demo09StreamAndMethodReference.demo03FunctionReference.Demo04ArrayRef;

/**
 * 数组的构造器引用
 */
public class Demo {

    /**
     * 定义一个方法
     * 方法的参数传递创建数组的长度和ArrayMaker
     */
    public static int getArrayLength(int length, ArrayMaker maker) {
        int[] make = maker.make(length);
        return make.length;
    }

    public static void main(String[] args) {

        /**
         * 1 使用lambda
         */
        int length = getArrayLength(10, (len) -> {
            int[] arr = new int[len];
            return arr;
        });
        System.out.println(length);


        /**
         * 2 使用 数组构造器
         */

        int length2 = getArrayLength(9, int[]::new);
        System.out.println(length2);

    }
}
