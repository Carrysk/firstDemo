package com.carrysk.Demo01Map.mapPractice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * fun1 输入一串字符串 计算每个字符的个数 并打印（使用Map）
 * exp： aaabbbccccddddd =》 a=3 b=3 c=4 d=5
 *  step: 1. 获取输入的字符串
 *        2。 遍历字符串
 *        3。 使用map存储
 *         3。1 判断是否存储了某个字符
 *          3。1。1存在则+1
 *          3。2。2不存在则赋值1
 *        4。遍历map集合 并打印
 */
public class Practice01CountChar {
    public static void main(String[] args) {
        fun1();
    }

    private static void fun1() {
        Scanner sc = new Scanner(System.in);

        // 1.获取输入字符串
        String str = sc.hasNext() ? sc.nextLine() : "";

        // 2.使用hashMap存储 每个字符的个数
        HashMap<Character, Integer> map = new HashMap<>();

        // 3.遍历输入字符串的每个字符
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey((c))) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        // 4.打印map集合
        Set<Character> set = map.keySet();
        for (Character character : set) {
            System.out.println(character + " = " + map.get(character));
        }
    }
}
