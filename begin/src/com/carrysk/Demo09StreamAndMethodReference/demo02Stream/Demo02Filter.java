package com.carrysk.Demo09StreamAndMethodReference.demo02Stream;

import java.util.stream.Stream;

/**
 * 延迟性方法 filter 过滤出 匹配的类型 参数传递 Predicate接口对象实现类
 *  Stream<T> filter(Predicate<? super T> predicate)
 *    Predicate抽象方法 boolean test(T t);)
 */
public class Demo02Filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王二勾子");
        stream.filter(str -> str.length() == 4).forEach(str -> System.out.println(str));

        /**
         * Stream 流 属于管道类，只能被消费（使用）一次!
         *   Stream流 使用完毕后，就会关闭
         *
         *
         *   stream 已被使用 再次使用 就会报错
         *
         */
//        stream.forEach(str-> System.out.println(str));  // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed?
    }
}
