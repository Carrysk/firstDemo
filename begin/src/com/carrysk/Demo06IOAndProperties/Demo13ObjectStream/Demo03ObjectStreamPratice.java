package com.carrysk.Demo06IOAndProperties.Demo13ObjectStream;

import java.io.*;
import java.util.ArrayList;

/**
 * 序列化练习
 */
public class Demo03ObjectStreamPratice {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1 create ArrayList<Person>
        ArrayList<Person> outputList = new ArrayList<>();
        outputList.add(new Person("xiaoming", 19));
        outputList.add(new Person("xiaofang", 20));

        // 2 create ObjectOutputStream 对象序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./out/list.txt"));

        oos.writeObject(outputList);

        // 2 create ObjectInputStream 对象反序化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./out/list.txt"));
        ArrayList<Person> inputList = (ArrayList<Person>) ois.readObject();

        for (Person person : inputList) {
            System.out.println(person);
        }

        ois.close();
        oos.close();
    }
}
