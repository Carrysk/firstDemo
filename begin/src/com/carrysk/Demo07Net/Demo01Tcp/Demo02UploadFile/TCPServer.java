package com.carrysk.Demo07Net.Demo01Tcp.Demo02UploadFile;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * 服务器 接收上传文件
 */
public class TCPServer {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket socket = null;
        try {
            // 1 create ServerSocket
            ss = new ServerSocket(1111);

            // 2 create inputStream
            socket = ss.accept();
            InputStream is = socket.getInputStream();

            // 3 receive file        // 1 create Socket
            byte[] b = new byte[1024];
            int len = -1;
            File dir = new File("./out/upload");
            // 上传前 先判断目录是否存在， 不存在则创建
            if (!dir.exists()) {
                dir.mkdir();
            }
            FileOutputStream fos = new FileOutputStream(new File("./out/upload/export.txt"));
            while ((len = is.read(b)) != -1) {
                System.out.println("accept");
                fos.write(b, 0, len);
            }

            OutputStream os = socket.getOutputStream();
            System.out.println("send message to client ");
            os.write("upload success".getBytes());
            socket.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
