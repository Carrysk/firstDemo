package com.carrysk.Demo09StreamAndMethodReference.demo02Stream;

import java.util.stream.Stream;

/**
 * limit（long num） 从1 到num 截止 的元素转化为下一个流 一共取 num个 非 num+1个
 * 延迟型方法
 */
public class Demo06StreamLimit {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        Stream<String> stringStream = stream.limit(3);
        stringStream.forEach(str-> System.out.println(str));
    }
}
