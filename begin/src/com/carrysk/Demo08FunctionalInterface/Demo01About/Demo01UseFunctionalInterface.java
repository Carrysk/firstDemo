package com.carrysk.Demo08FunctionalInterface.Demo01About;

/**
 *  函数式接口的使用一般可以作为方法的参数和返回值类型
 */
public class Demo01UseFunctionalInterface {
    // 定义一个方法 参数使用函数式接口 所以可以传递接口的匿名内部类
    public static void show(MyFunctionalInterface myFun) {
        myFun.method();
    }

    public static void main(String[] args) {

        // 1 调用show方法 参数传递匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("MyFunctionalInterface");
            }
        });

        // 2 调用传递 接口的实现类
        show(new MyFunctionalInterfaceImp());

        // 3 使用lambda表达式简化匿名内部类
        show(()-> System.out.println("lambda"));
    }
}
