package com.carrysk.Demo09StreamAndMethodReference.demo02Stream;

import java.util.stream.Stream;

/**
 *  映射 map 使用Function接口 转换流
 *  <R> Stream<R> map(Function<? super T, ? extends R> mapper);
 *
 *    Function 中的抽象方法
 *      R apply(T t)
 *      */
public class Demo04StreamMap {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3");

        Stream<Integer> stream2 = stream.map(str -> Integer.parseInt(str) + 1);

        stream2.forEach(num-> System.out.println(num));
    }
}
