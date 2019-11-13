package com.carrysk.Demo09StreamAndMethodReference.demo02Stream;

import java.util.stream.Stream;

/**
 * 延迟型方法 skip
 * Stream<T>  skip(long n);
 * 跳过几个元素 选取他之后的
 * <p>
 * 如果流 大于n 则跳过n 选择它之后的，否则得到一个空流
 */
public class Demo07StreamSkip {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);
        stream.skip(3).forEach(num -> System.out.println(num));  // 4

    }
}
