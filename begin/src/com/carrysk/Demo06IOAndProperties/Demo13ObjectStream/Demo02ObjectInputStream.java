package com.carrysk.Demo06IOAndProperties.Demo13ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 对象反序列化
 * java.io.ObjectInputStream extends InputStream
 *   ObjectInputStream 对象的反序列化流
 *   作用 把文件中保存的对象，以流的方式读取出来使用
 *
 *   构造方法：
 *      ObjectInputStream(InputStream is) 创建从指定字节输入流读取的Object对象
 *
 *   特有的成员方法
 *     Object readObject() 从ObjectInputStream 读取对象
 *
 *   使用步骤
 *     1 创建对象反序列化流
 *     2 readObject
 *     3 释放资源
 */
public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1 create
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./out/person.txt"));

        // read
        Object o = ois.readObject();

        // 3
        ois.close();

        System.out.println(o);

        Person person  = (Person)o;
        System.out.println(person);
        System.out.println(person.getName());
    }
}
