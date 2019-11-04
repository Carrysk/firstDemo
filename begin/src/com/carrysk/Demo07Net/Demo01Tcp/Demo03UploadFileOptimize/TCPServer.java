package com.carrysk.Demo07Net.Demo01Tcp.Demo03UploadFileOptimize;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * 服务器 接收上传文件
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {

        // 1 create ServerSocket
        ServerSocket ss = new ServerSocket(1111);

        // 持续接收文件
        while (true) {
            Socket socket = ss.accept();

            /**
             * 单一线程上传太慢 启动多线程接受上传的文件
             */
            new Thread(new Runnable() {
                @Override
                public void run() {

                    try {
                        InputStream is = socket.getInputStream();

                        // 3 receive file        // 1 create Socket
                        byte[] b = new byte[1024];
                        int len = -1;
                        File dir = new File("./out/upload");
                        // 上传前 先判断目录是否存在， 不存在则创建
                        if (!dir.exists()) {
                            dir.mkdir();
                        }
                        String filename = "/" + new Date().getTime() + ".txt";
                        FileOutputStream fos = new FileOutputStream(dir + filename);
                        System.out.println("accept");
                        while ((len = is.read(b)) != -1) {
                            fos.write(b, 0, len);
                        }

                        OutputStream os = socket.getOutputStream();
                        System.out.println("send message to client ");
                        os.write("upload success".getBytes());
                        socket.shutdownOutput();
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
            }).start();
        }
    }
}
