package com.carrysk.Demo03Thread.demo01Thread;

/**
 *  线程
 *    单线程：JVM只有一个main（主）线程
 *      当程序运行到main方法，开辟一个main线程自上而下的执行程序代码
 */


public class MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("zhangsan");
        p1.run();

        System.out.println("p1 跑完了！！！ 才能p2 跑");
        Person p2 = new Person("lisi");
        p2.run();
    }
}

class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(name + "=> run" + i);
        }
    }
}
