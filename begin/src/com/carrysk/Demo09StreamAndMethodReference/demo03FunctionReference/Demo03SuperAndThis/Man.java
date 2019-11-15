package com.carrysk.Demo09StreamAndMethodReference.demo03FunctionReference.Demo03SuperAndThis;

/**
 *
 *  如果存在继承关系 当lambda中需要出现super调用时， 也可以使用方法引用进行替代
 *
 * 子类 继承父类 Human
 */
public class Man extends Human {
    @Override
    void sayHello() {
        System.out.println("Man: Hallo");
    }

    void method(GreetAble g) {
        g.greet();
    }


    /**
     * 使用方法 调用此类的成员方法 成员方法中可使用super关键字 调用父类成员方法
     */
    void show() {
        // 1 直接使用
        method(()->{
            Human h = new Human();
            h.sayHello();
        });

        // 2 使用super
        method(()->{
            super.sayHello();
        });

        // 3 使用方法引用
        method(super::sayHello);

        // 4 this 使用本类方法
        method(this::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
