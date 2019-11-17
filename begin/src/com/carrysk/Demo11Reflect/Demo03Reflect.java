package com.carrysk.Demo11Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Class 对象功能
 * * 获取功能
 * 1  获取成员变量们
 * Field[] getFields() ** 获取所有由public 修饰的成员变量
 * Field getField(String name)  ** 会抛出异常
 * <p>
 * Field[] getDeclaredFields()  ** 获取所有的成员变量
 * Field getDeclaredField(String name) *** 获取单个成员变量
 * 2 获取构造方法
 * Constructor<?>[] getContructor()
 * Constructor<T> getConstructor(类<?>... parameterTypes)
 * <p>
 * Constructor<?> getDeclaredConstructor()
 * Constructor<T> getDeclaredConstructor(类<?> ... parmeterTypes)
 * 3 获取成员方法
 * Method[] getMethods()
 * Method getMethod(String name)
 * <p>
 * Method[] getDeclaredMethods()
 * Method getDeclaredMethod(String name, 类<?> ...parameterTypes)
 * 4 获取类名
 * String getName()
 * <p>
 * Field
 * 设置值
 * void set(Object obj, Object value)
 * 获取值
 * get(Object obj)
 * 忽略访问权限修饰符的安全检查
 * setAccessible(true) 暴力反射
 * <p>
 * Construtor 构造方法
 * 操作
 * newInstance(Object... initargs)
 * 如果空参数 可直接使用class.newInstance() 即可
 * <p>
 * Method 方法对象
 * 操作
 * 执行方法
 * Object invoke(Object obj, Object... args)
 * 获取方法名称
 * String getName()
 */
public class Demo03Reflect {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;

        // 1 获取方法 不带Declare 的 可获取public

        Person p = new Person();
        Method method = personClass.getMethod("eat");
        method.invoke(p);


        // 获取类名
        String name = personClass.getName();
        System.out.println(name);
    }
}
