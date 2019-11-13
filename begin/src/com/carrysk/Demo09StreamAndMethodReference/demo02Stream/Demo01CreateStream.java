package com.carrysk.Demo09StreamAndMethodReference.demo02Stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * java.util.stream.Stream<T> 是java8 中加入的最常用的流接口。 （这并不是一个函数式接口）
 *   获取流的方式 有两种
 *     Collections——》 default Stream<T> stream()
 *        所有的Collections集合 都可以通过stream默认方法获取流；
 *     Stream -> static <T> Stream<T> of(T ...values)
 *        参数是一个可变参数，那么我们就可以传递一个数组
 */
public class Demo01CreateStream {
    public static void main(String[] args) {
        // 1 通过 Collections 的默认方法 stream
        List<String> list1 = new ArrayList<>();
        Stream<String> stream = list1.stream();

        Set<String> set1 = new HashSet<>();
        Stream<String> stream1 = set1.stream();

        Map<String, String> map = new HashMap<>();
        // 获取键 存储到一个Set集合
        Set<String> keyset = map.keySet();
        Stream<String> stream2 = keyset.stream();

        //获取值 存储的set
        Collection<String> values = map.values();
        Stream<String> stream3 = values.stream();

        // entrySet
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream4 = entries.stream();


        // 2 通过 Stream静态方法 of(T ...values)
        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4);

        int[] arr = {1,2,3};
        Stream<Object> stream6 = Stream.of(arr);

    }
}
