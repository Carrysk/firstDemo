package com.carrysk.Demo06IOAndProperties.Demo11Buffered;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

/**
 * 读取文本 排序后，写入另一个文件
 */
public class Demo04CharPartice {
    public static void main(String[] args) throws IOException {
        // 1 创建缓冲字符输入流
        FileReader fr = new FileReader("./out/a.txt");
        BufferedReader br = new BufferedReader(fr);

        // 2 创建缓冲字符输出流
        FileWriter fw = new FileWriter("./out/copy.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        // 3 创建存储的HashMap
        HashMap<String, String> map = new HashMap<>();

        // 4 读取文本 使用hashmap存储
        String line;
        while (null != (line = br.readLine())) {
            String[] split = line.split("\\.");
            if (split.length == 2)
                map.put(split[0], split[1]);
        }

        // 5 遍历map
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String content = map.get(key);
            bw.write(key + "." + content);
            bw.newLine();
        }

        // 6 释放
        bw.close();
        br.close();
    }
}
