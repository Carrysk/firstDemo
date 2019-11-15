package com.carrysk.Demo09StreamAndMethodReference.demo03FunctionReference.Demo02ObjectMethodReference;

import com.sun.jdi.Method;

/**
 * 通过对象名引用成员方法
 * 使用前提是对象是已经存在的，成员方法也是已经存在
 * 就可以使用对象名来引用成员方法
 */
public class Demo01Main {
    public static void main(String[] args) {

        /**
         *  调用method 方法
         */
        method("hello world", (str) -> {
            MethodRerObject mr = new MethodRerObject();
            mr.method(str);
        });

        /**
         * 使用方法引用优化lambda
         * 对象已经存在method方法
         * 使用对象名引用成员方法 简化
         */
        MethodRerObject mr = new MethodRerObject();
        method("hello world2", mr::method);


        /**
         * 使用 类的静态方法
         */
        method("HELlo world3", MethodRerObject::methodStatic);
    }

    /**
     * 定义一个方法 参数传递一个Printable接口一个目标的字符串
     */

    public static void method(String str, Printable p) {
        p.print(str);
    }
}
