package com.carrysk.Demo09StreamAndMethodReference.demo03FunctionReference;

/**
 *  使用函数式接口 完成 函数引用
 */
public class Demo {
    /**
     * 定义方法
     * @param p
     */
    public static void printWorld(Printable p) {
        p.print("hello world");
    }

    public static void main(String[] args) {
        printWorld((s)->{
            System.out.println(s);
        });

        /**
         * :: 双冒号 引用运算法 而它所在的表达式称为方法引用。
         * 如果lambda要表达的函数方案已经存在于某个方法的实现中，
         *   那么则可以通过双冒号来引用该方法作伪lmbda的替代者
         * 注意lambda传递的参数 一定是 哪个替代方法的需要传递的参数类型 否则抛出异常
         *
         *   分析
         *    lambda 表达式的目的，打印参数传递的字符串
         *    把（**参数s**）传递给System.out对象 调用out对象中的方法println对字符串进行输出
         *    注意
         *       1 System.out 对象是已经存在的
         *       2 println 方法也是已经存在的
         *     所以我们可以使用方法引用来优化lambda表达式
         *     可以使用system.out方法直接引用（调用)println方法
         */
        printWorld(System.out::println);
    }
}
