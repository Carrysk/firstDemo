package com.carrysk.Demo07Net.Demo01Tcp.Demo04BS;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);

        while(true) {
            Socket socket = ss.accept();

            InputStream inputStream = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            System.out.println("receive request");

            char[] c = new char[1024];
            int len = -1;
       /* while (-1 != (len = br.read(c))) {
            System.out.println(new String(c, 0 ,len));
        }*/
//        GET /index.html HTTP/1.1
//        Host: 127.0.0.1:8080
//        Connection: keep-alive
//        Upgrade-Insecure-Requests: 1
//        User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.87 Safari/537.36
//        Sec-Fetch-User: ?1
//        Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3
//        Sec-Fetch-Site: none
//        Sec-Fetch-Mode: navigate
//        Accept-Encoding: gzip, deflate, br
//        Accept-Language: zh-CN,zh;q=0.9
//        Cookie: Idea-e92f28cd=0b8730cb-fe3e-40ed-bfc2-ca45c710a863

            String s = br.readLine();
            String targetName = "/index.html";
            String[] s1 = s.split(" ");

            if (s1 != null && s1.length == 3 && !s1[1].equals("/")) {
                targetName = s1[1];
            }
            File dir = new File("./src/com/carrysk/Demo07Net/Demo01Tcp/Demo04BS");
            if (dir.exists() && dir.isDirectory()) {

                // 输出流
                OutputStream outputStream = socket.getOutputStream();
                File targetFile = new File(dir + targetName);
                if (targetFile.exists()) {
                    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(targetFile));
                    byte[] b = new byte[1024];
                    int len2 = -1;
                    outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
                    outputStream.write("Content-Type:text/html\r\n".getBytes());
                    outputStream.write("\r\n".getBytes());
                    while(-1 != (len2 = bis.read(b))) {
                        outputStream.write(b, 0, len2);
                    }

                    // 释放
                    bis.close();
                }
            }
            socket.close();
        }
    }
}
