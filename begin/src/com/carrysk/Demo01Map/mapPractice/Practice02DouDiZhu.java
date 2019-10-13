package com.carrysk.Demo01Map.mapPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * 斗地主练习
 *  步骤
 *  1 组装牌
 *  2 洗牌
 *  3 发牌
 *  4 排序
 *  5 展示牌
 */
public class Practice02DouDiZhu {
    public static void main(String[] args) {
        // 1 组装牌
        // List.of Java9.0新特性 创建list集合 键和值不能为NULL 创建后不可修改
        List<String> numbersList = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        List<String> colorsList = List.of("♥️", "♦️", "♠️", "♣️");
        HashMap<Integer, String> poker = new HashMap<>(); // 带顺序的牌组
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();

        int index = 0;
        poker.put(index++, "JOKER");
        pokerIndex.add(index-1);
        poker.put(index++, "QUEEN");
        pokerIndex.add(index-1);

        for (int i = 0; i < numbersList.size(); i++) {
            for (int i1 = 0; i1 < colorsList.size(); i1++) {
                poker.put(index++, colorsList.get(i1) + numbersList.get(i));
                pokerIndex.add(index-1);
            }
        }

        // 2 洗牌 使用Collections.suffle（pokerIndex）
        Collections.shuffle(pokerIndex);

        // 3 发牌
        for (int i = 0; i < pokerIndex.size(); i++) {
            if (51 <= i) {
                dipai.add(pokerIndex.get(i));
            } else if (0 == i%3) {
                player01.add(pokerIndex.get(i));
            } else if (1 ==i%3) {
                player02.add(pokerIndex.get(i));
            } else if (2 == i%3) {
                player03.add(pokerIndex.get(i));
            }
        }

        // 4 整理每份牌的顺序
        // Collection.sort(list, Complarator<T>() {}) 默认升序排序 可自定义 需实现Comparable接口 重写compareTo<T> api˚
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(dipai);

        // 5 展示牌  -》 每个人存着牌的号码-》根据号码打印牌

        showPoker("zhangsan", poker, player01);
        showPoker("lisi", poker, player02);
        showPoker("wanger", poker, player03);
        showPoker("dipai", poker, dipai);
    }

    private static void showPoker(String name, HashMap<Integer, String> poker, ArrayList<Integer> pokerIndex) {
        System.out.print(name + "：");
        for (Integer index : pokerIndex) {
            System.out.print(poker.get(index));
        }
        System.out.println("");
    }
}
