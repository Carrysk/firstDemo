package com.carrysk.Demo08FunctionalInterface.Demo01About;

/**
 * 函数式接口 仅有一个抽象方法 可以有其他方法（默认，静态，私有的）
 *
 * @FunctionalInterface 注解
 *   作用 可以检测接口是否是一个函数式接口
 *     是 编译成功
 *     否 编译失败（接口中没有抽象方法或多于一个
 */

@FunctionalInterface
public interface MyFunctionalInterface {
    public abstract void method();
}
