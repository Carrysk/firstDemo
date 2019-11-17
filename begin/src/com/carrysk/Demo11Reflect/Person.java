package com.carrysk.Demo11Reflect;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public String a;
    protected String b;
    String c;
    private String d;

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }

    public void eat() {
        System.out.println("吃shit");
    }

    public void eat(String food) {
        System.out.println("吃 " + food);

    }
}
