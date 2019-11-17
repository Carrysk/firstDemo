package com.carrysk.Demo11Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * Class 对象功能
 *      * 获取功能
 *      1  获取成员变量们
 *          Field[] getFields() ** 获取所有由public 修饰的成员变量
 *          Field getField(String name)  ** 会抛出异常
 *
 *          Field[] getDeclaredFields()  ** 获取所有的成员变量
 *          Field getDeclaredField(String name) *** 获取单个成员变量
 *      2 获取构造方法
 *          Constructor<?>[] getContructor()
 *          Constructor<T> getConstructor(类<?>... parameterTypes)
 *
 *          Constructor<?> getDeclaredConstructor()
 *          Constructor<T> getDeclaredConstructor(类<?> ... parmeterTypes)
 *      3 获取成员方法
 *         Method[] getMethods()
 *         Method getMethod(String name)
 *
 *         Method[] getDeclaredMethods()
 *         Method getDeclaredMethod(String name, 类<?> ...parameterTypes)
 *      4 获取类名
 *        String getName()
 *
 *  Field
 *     设置值
 *       void set(Object obj, Object value)
 *     获取值
 *       get(Object obj)
 *     忽略访问权限修饰符的安全检查
 *       setAccessible(true) 暴力反射
 */
public class Demo02Reflect {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;

        Constructor constructor = personClass.getConstructor(String.class);
        System.out.println(constructor);
        Object p = constructor.newInstance("张三");
        System.out.println(p);

        System.out.println("-----------------");

        Constructor constructor1 = personClass.getConstructor();  // 空参构造函数
        Object o = constructor1.newInstance();
        System.out.println(o);

        System.out.println("======================");

        Object o1 = personClass.newInstance();  // 空参数 创建对象可直接使用 Class 中 newInstance方法
        System.out.println(o1);
    }
}
