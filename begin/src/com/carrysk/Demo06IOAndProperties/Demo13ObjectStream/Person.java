package com.carrysk.Demo06IOAndProperties.Demo13ObjectStream;

import java.io.Serializable;

/**
 * 需要序列化的对象 要实现Serializable的接口
 *
 * static 优先于类
 * transient 瞬态关键字
 *    如果不希望某个属性被序列化 可🏠transient
 */
public class Person implements Serializable {
    // 偶尔修改要序列化的类 会抛出vaildClassException
    // 需要指定序列化的id即可
    private static final long serialVersionUID = 1L;

    private String name;
//    private transient int age;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
