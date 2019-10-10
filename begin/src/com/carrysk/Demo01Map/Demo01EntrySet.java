package com.carrysk.Demo01Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/***
 *  Map 实现了 Entry 接口
 *  Entry<k, v>
 *
 *   案例 遍历Map接口方式
 *    1 Set <Map.Entry<k, v>> entrySet() 产生Set对象
 *    2 遍历Set对象 获取Entry对象
 *    3 使用Entry对象的 getKey 和 getValue 方法 获取键值和值
 */

class Demo01EntrySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Carrysk", 18);
        map.put("mie", 18);

        System.out.println(map); // {Carrysk=18, mie=18}

        Set<Map.Entry> set = getSet(map);

        // 遍历set集合
        // 1。 使用迭代器遍历set集合
        Iterator<Map.Entry> it = set.iterator();
        while(it.hasNext()) {
            Map.Entry entry = it.next();

            // 使用Map.Entry 中 getKey 获取键值 getValue 获取 值
            Object key = entry.getKey();
            Object value = entry.getValue();

            System.out.println("key = " + key + ", value = " + value);
        }
        System.out.println("---------分割线-------------");

        // 使用 增强for遍历set
        for (Map.Entry entry : set) {

            // 使用Map.Entryu 中 getKey 获取键值 getVlaue 获取值
            Object key = entry.getKey();
            Object value = entry.getValue();

            System.out.println("key = " + key + ", value = " + value);
        }
    }
    private static Set<Map.Entry> getSet(Map map){
        return map.entrySet();
    }
}
