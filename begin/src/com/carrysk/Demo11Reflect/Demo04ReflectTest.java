package com.carrysk.Demo11Reflect;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 需求 写一个框架", 可以帮我们创建任意诶的对象，并且执行其中任意方法
 * // 1 将需要创建对象的类的全类名和需要执行的方法定义在配置文件中
 * // 2 在程序中加载读取配置文件
 * // 3 使用反射技术来加载类文件进内存
 * // 4 创建对象
 * // 5 执行方法
 */
public class Demo04ReflectTest {
    public static void main(String[] args) throws Exception {
        // 可以创建任意类的对象名，可以执行任意方法
        // 改变该类的任何代码，可以创建任意类的对象


        // 1 加载配置文件
        // 1.1 创建Properties对象
        Properties pro = new Properties();
        // 1.2 加载配置文件，转化为一个集合
        Class reflect = Demo04ReflectTest.class;
        ClassLoader classLoader = reflect.getClassLoader(); // 获取类加载器
        System.out.println(classLoader.getResource(""));
        InputStream is = new FileInputStream("./src/com/carrysk/Demo11Reflect/pro.properties");
//        InputStream is = classLoader.getResourceAsStream("./pro.properties");
        pro.load(is);

        // 2 获取类名 和方法名
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("method");

        // 3 加载该类
        Class cls = Class.forName(className);
        // 4 创建对象
        Object o = cls.newInstance();

        Method method = cls.getMethod(methodName);
        method.invoke(o);


    }
}
