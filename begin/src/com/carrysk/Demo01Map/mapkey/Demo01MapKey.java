package com.carrysk.Demo01Map.mapkey;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/***
 * HashMap 键值使用自定义类型 必须重写 hashCode 和 equals方法 =》 保证key唯一
 *      值无所谓
 */
public class Demo01MapKey  {
    public static void main(String[] args) {
        fun2();

    }

    /**
     * HashMap<Person, String>
     *     Person 需重写hashCode 和 equals方法 =》 保证key唯一
     *     String 值任意
     */
    private static void fun2() {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("zhangsan", 18), "BEIJING");
        map.put(new Person("lisi", 19), "SHANGHAI");

        // 使用entrySet 产生set 遍历
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " is " + value + " people");
        }

    }

    /**
     * HashMap<String, Person>
     *     String 自带hashCode和 equals方法 无需重写
     *     Person 为值 任意
     */
    private static void fun1() {
        HashMap<String, Person> map = new HashMap<>();
        map.put("1", new Person("zhangsan", 18));
        map.put("2", new Person("lisi", 17));

        // 使用keySet遍历HashMap
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            Person person = map.get(key);
            System.out.println(key + "--" + person);
        }
    }
}
