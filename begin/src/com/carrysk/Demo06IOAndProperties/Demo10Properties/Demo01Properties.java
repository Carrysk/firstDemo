package com.carrysk.Demo06IOAndProperties.Demo10Properties;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

/**
 * java.util.Properties 集合 extends Hashtable<k, v> implements Map<k, v>
 *   Properties 类表示类一个持久的属性集，Properties可保存在流中或从流中加载。
 *   Properties 集合 是一个唯一和IO流相结合的集合
 *      可以使用Properites中的store方法 把集合中的临时数据，持久化写入到硬盘中存储
 *      可以使用Properties集合中的方法load 把硬盘中保存的文件（键值对） 读取到集合中使用
 *  Properies列表 中的每个键及其对应的值都是一个字符串
 *     Properties集合是一个双列集合，key和value默认都是字符串
 */
public class Demo01Properties {
    public static void main(String[] args) {
        show01();
    }

    /**
     * 使用Properties集合 存储数据 遍历取出properties集合中的数据
     * Properties 是一个双列集合，key和value 都是字符串
     * Properties 集合有一些操作字符串的特有方法
     *   Object setProperty(String key, String value) 调用hashtable中的put
     *   String getProperty(String key) 通过key找到value值
     *   Set<String> stringPropertyNames() 返回此属性列表中的键集， 启动该键及其对应的值是字符串
     */
    private static void show01() {
        Properties pro = new Properties();

        pro.setProperty("你好", "China");
        pro.setProperty("中国", "你好");

        Set<String> keys = pro.stringPropertyNames();

        for (String key : keys) {
            String property = pro.getProperty(key);

            System.out.println(key + " = " + property);
        }
    }
}
