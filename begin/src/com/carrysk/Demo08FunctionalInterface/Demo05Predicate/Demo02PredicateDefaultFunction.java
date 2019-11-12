package com.carrysk.Demo08FunctionalInterface.Demo05Predicate;

import java.util.function.Predicate;

/**
 * Predicate 默认方法
 * and 连接两个
 * or 或
 * negate 取反
 */
public class Demo02PredicateDefaultFunction {
    public static void main(String[] args) {
        String target = "123";

        boolean b = justifyStringAnd(
                target,
                str1 -> str1.length() >= 3,
                str2 -> str2.startsWith("1"));
        System.out.println(b);

        boolean b1 = justifyStringOr(target, str1 -> str1.length() > 5, str2 -> str2.contains("3"));
        System.out.println(b1);

        boolean b2 = justifyStringNegate(target, str -> str.length() == 3);
        System.out.println(b2);
    }

    /**
     * 定义一个方法 使用and
     */
    public static boolean justifyStringAnd(String target, Predicate<String> pre1, Predicate<String> pre2) {
        // 等同 pre1.test(target) && pre2.test(target)
        return pre1.and(pre2).test(target);
    }

    /**
     * 定义一个方法 使用or
     */
    public static boolean justifyStringOr(String target, Predicate<String> pre1, Predicate<String> pre2) {
        // 等同 pre1.test(target) || pre2.test(target)
        return pre1.or(pre2).test(target);
    }

    public static boolean justifyStringNegate(String target, Predicate<String> pre1) {

        // !
        // (str) -> !pre1.test(str)
        return pre1.negate().test(target);
    }
}
