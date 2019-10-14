package com.carrysk.Demo02Exception.dealException;

/**
 * finally 关键字
 * 使用方法
 *    try {
 *        throw new Excpetion("bug");
 *        // 异常抛出后的代码就不会再执行
 *    }
 *    catch(Exception e) {}
 *    finally{
 *        // 无论是否有异常 都会执行的代码
 *    }
 *
 *    finally 一般用于资源回收。无论是否出现异常，都要进行资源回收
 */

public class Demo03Finally {
    public static void main(String[] args) {
        try {
            throw new Exception("bug"); // 抛出异常
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("无论异常与否都会执行的代码块");
            System.out.println("一般用于资源回收 exp：IO流");
        }
    }
}
