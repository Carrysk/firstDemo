package com.carrysk.Demo02Exception.dealException;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 异常分为
 *  Exception 是一些错误，可被处理
 *    runtimeException 是运行时异常 可不被自行处理
 *    编译时异常 需要抛出异常， 将异常交给方法的调用者处理（逐层抛出，指导抛到jvm处理=》jvm 会将异常打印在控制台，然后中断程序）
 *  Error error是中断程序，例如内存溢出 栈溢出等
 * throws Exception 处理抛出的异常情况
 * 作用： 当方法内部抛出异常对象的时候，就必须处理这个异常对西对象
 *       可以使用throws关键字处理异常对象，会把异常对象抛给方法的调用者处理，最终交给JVM处理==》》中断处理
 * 使用格式：在方法声明时使用
 *         修饰符 返回值类型 方法名（参数列表）throws AAAException，BBBException。。。 {
 *               throw new AAAException("REASON);
 *               throw new BBBException("REASON");
 *         }
 *  注意：
 *   1。throws 关键字必须写在方法声明处
 *   2。throws 关键字后边声明的异常必须是Exception或者Exception的子类
 *   3。方法内部如果抛出了多个异常对象，那么throws后边必须也声明多个异常
 *       如果抛出的多个异常对象有子父类关系，那么直接声明父类异常即可
 *   4。调用了一个声明抛出异常的方法，就必须处理声明的异常
 *       要么继续使用throws声明抛出， 交给方法的调用者处理，最终交给JVM
 *       要么try。。。catch自己处理异常
 *
 */

public class demo01Throws {

    public static void main(String[] args) throws IOException {
        readFile("~/Desktop/1.txtt");
    }

    private static void readFile(String s) throws IOException {
        if (!s.equals("~/Desktop/1.txtt")) {
            throw new FileNotFoundException("~/Desktop/1.txt未找到 ");
        }
        if (!s.endsWith(".txt")) {
            throw new IOException("文件后缀不正确，" + s);
        }
        System.out.println("找到文件，无异常情况");
    }
}
