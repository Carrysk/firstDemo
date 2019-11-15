package com.carrysk.Demo09StreamAndMethodReference.demo02Stream;

import java.io.Serializable;
import java.util.stream.Stream;

/**
 * Stream 流中 静态方法 concat 将两个流结合成一个流
 * static <T> Stream<T> concat(Stream< ? super T>， Stream<? super T>)
 */
public class Demo08Concat {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1);
        Stream<String> stringStream = Stream.of("2");

        Stream<? extends Serializable> streamRes = Stream.concat(integerStream, stringStream);
        streamRes.forEach(item-> System.out.println(item));
    }
}
