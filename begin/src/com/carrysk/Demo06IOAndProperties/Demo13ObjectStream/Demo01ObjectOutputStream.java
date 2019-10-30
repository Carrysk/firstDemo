package com.carrysk.Demo06IOAndProperties.Demo13ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * 对象的序列化
 * java.io.ObjectOutputStream extends OutputStream 将将对象序列化后保存起来
 *   构造方法
 *   ObjectOutputStream(OutputStream ops)
 *   api:
 *      writeObject(Object obj)
 *   使用
 *     1 创建ObjectOutputStream对象
 *     2 创建需要序列化的实例
 *     3 输出
 *     4 关闭资源
 *
 * **** NotSerializableException
 * 需要序列化或反序列化的对象 需要实现Serializable接口（标记）
 */
public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./out/person.txt"));

        Person person = new Person("liming", 19);

        oos.writeObject(person);
    }
}
