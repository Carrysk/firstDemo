package com.carrysk.Demo06IOAndProperties.Demo09FileException;

import java.io.FileWriter;
import java.io.IOException;

/**
 * JDK7 新特性
 * 在try 后边可以增加一个() 在()中可以定义流对象
 * 那么这个流对象的作用域就在try中有效
 * try的代码执行完毕，会把流对象释放，不用写finally
 * 格式
 * try(定义流对象。。。）{
 * 肯能会产出异常的代码
 * } catch(异常类变量 变量名）{
 * 异常的处理逻辑
 * }
 */
public class Demo02Exception {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("./out/a.txt")) {
            fw.write(".........");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
