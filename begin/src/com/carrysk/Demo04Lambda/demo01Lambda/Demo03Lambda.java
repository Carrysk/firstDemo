package com.carrysk.Demo04Lambda.demo01Lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 使用有参的lambda 表达式
 * (参数列表）->{ 代码 }
 *
 */
public class Demo03Lambda {

    public static void main(String[] args) {
        Person[] arr = {
                new Person("柳岩", 20),
                new Person("迪丽热巴", 18),
                new Person("玛尔扎哈", 38),
        };

        // 1 使用 带参数带返回值的匿名内部类
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person person, Person t1) {
//                return  person.getAge() - t1.getAge();
//            }
//        });
//
        // 1 使用lambda表达式完成排序
        Arrays.sort(arr, (person, t1) -> {
            return person.getAge()  - t1.getAge();
        });

        for (Person person : arr) {
            System.out.println(person);
        }
    }
}

class Person {
    private String name;
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
