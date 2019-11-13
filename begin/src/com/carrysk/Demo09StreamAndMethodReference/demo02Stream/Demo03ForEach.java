package com.carrysk.Demo09StreamAndMethodReference.demo02Stream;

import java.util.stream.Stream;

/**
 * stream流 方法 分为延迟方法和终结方法
 *   延迟方法 使用后可再使用流方法
 *   终结方法 使用后无法使用其他流方法（count forEach）
 *
 *   forEach 遍历流中 数据
 *     forEach(Consumer<T> consumer)
 *
 */
public class Demo03ForEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三","李四","王二勾子");
        stream.forEach(str-> {
            if (str.length() == 2 ) {
                System.out.println(str);
            }
        });
    }
}
