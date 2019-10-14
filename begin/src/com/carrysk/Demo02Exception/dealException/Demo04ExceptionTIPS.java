package com.carrysk.Demo02Exception.dealException;

import java.util.List;

/**
 * 异常处理 注意事项
 * 一对一处理  对每个异常分别处理
 * 多对多处理  将可能发生的异常都捕获（注意： 异常对象可能有子父关系，需将子放再上面，否则报错）
 * 多对一处理  对可能发生的异常情况 统一处理
 *
 * 注意！！！ 运行时抛出异常可不处理 交给JVM统一处理
 */
public class Demo04ExceptionTIPS {
    public static void main(String[] args) {
        // 一对一
//        try {
//            int[] arr = {1, 2, 3};
//            System.out.println(arr[3]); // ArrayIndexOutOfBoundsException： Index 3
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
//        }
//
//        try {
//            List<Object> list = List.of(1, 2, 3); // ArrayIndexOutOfBoundsException: Inden 3
//            list.get(3);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
//        }
        // 多对多
//        try {
//            int[] arr = {1, 2, 3};
//            System.out.println(arr[3]); // ArrayIndexOutOfBoundsException： Index 3
//
//            List<Object> list = List.of(1, 2, 3); // ArrayIndexOutOfBoundsException: Inden 3
//            list.get(3);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
//        } catch (Exception e) {
//            System.out.println(e);
//        }


        // 多对一
//        try {
//            int[] arr = {1, 2, 3};
//            System.out.println(arr[3]); // ArrayIndexOutOfBoundsException： Index 3
//
//            List<Object> list = List.of(1, 2, 3); // ArrayIndexOutOfBoundsException: Inden 3
//            list.get(3);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
//        }


        int[] arr = {1, 2, 3};
        System.out.println(arr[3]); // ArrayIndexOutOfBoundsException： Index 3

        List<Object> list = List.of(1, 2, 3); // ArrayIndexOutOfBoundsException: Inden 3
        list.get(3);

        System.out.println("程序结束");
    }
}
