package com.carrysk.Demo07Net.Demo01Tcp.Demo02UploadFile;

import java.io.*;
import java.net.Socket;

// 客户端发送文件
public class TCPClient {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            // 1 create Socket
            socket = new Socket("127.0.0.1", 1111);

            OutputStream os = socket.getOutputStream();

            FileInputStream fis = new FileInputStream(new File("./out/person.txt"));
            byte[] b = new byte[1024];
            int len = -1;
            while (-1 != (len = fis.read(b))) {
                os.write(b, 0, len);
            }

            // 上传结束后， 服务器端始终收不到-1 需要手动结束输出流
            socket.shutdownOutput();

            InputStream is = socket.getInputStream();
            byte[] receive = new byte[1024];
            int len2 = -1;
            while (-1 != (len2 = is.read(receive))) {
                System.out.println("over");
                System.out.println(new String(receive, 0, len2));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
