package com.carrysk.Demo11Reflect;

import java.lang.reflect.Field;
import java.util.Arrays;

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
public class Demo01Reflect {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;

        // 1 getFields()
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        // 2 getField 抛出异常
        Field field = personClass.getField("a");
        System.out.println(field);

        //  3 getDeclaredFiled   获取所有的 成员变量, 不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        // 4 getDeclareFiled(String name)
        Field b = personClass.getDeclaredField("b");
        System.out.println(b);

        Person p = new Person();
        b.set(p, "123");
        System.out.println(p);

        Field d = personClass.getDeclaredField("d");
        // 忽略访问权限修饰符的安全检查
        d.setAccessible(true); // 暴力反射
        Object value = d.get(p);
        System.out.println(value);
    }
}
