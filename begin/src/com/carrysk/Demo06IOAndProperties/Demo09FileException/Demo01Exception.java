package com.carrysk.Demo06IOAndProperties.Demo09FileException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileException 处理
 * JDK1.7之前 采用try catch finaly
 */
public class Demo01Exception {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(new File("./out/a.txt"));

            for (int i = 0; i < 20; i++) {
                fw.write("hello world" + "\r");
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
