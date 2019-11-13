package com.carrysk.Demo09StreamAndMethodReference.demo02Stream;

import java.io.Serializable;
import java.util.stream.Stream;

/**
 * Stream流常用方法 count 用于统计元素个数
 *  终结流方法
 */
public class Demo05StreamCount {
    public static void main(String[] args) {
        Stream<? extends Serializable> stream = Stream.of("1", 2, 3, 5, 6);

        System.out.println(stream.count());

    }

}
