package com.carrysk.Demo07Net.Demo01Tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP通信的服务器端，接收客户端发送的数据，给客户端会写数据
 * java.net.ServerSocket 此类实现服务器套接字
 * <p>
 * 构造方法
 * ServerSocket(int port) 创建绑定到特定端口的服务器套接字
 * 服务器必须明确一件事情，必须知道是哪个客户端请求的服务器
 * 所以可以使用accpet方法获取到请求的客户端对象Socket
 * 成员方法
 * Scoket accpet（） 监听并接收到此套接字的链接
 * 使用步骤
 * 1 创建服务器ServerSocket对象和系统指定要的端口号
 * 2 使用ServerSocket对象中的方法accept 获取到请求的客户端对象Socket
 * 3 使用Socket对象中的方法getInputStream（） 获取网络字节输入流中的InputStream对象
 * 4 使用网络字节输入流InputStream对象的方法 read，读取客户端发送的信息
 * 5 使用Socket对象中的方法getOutputStream（） 获取网络字节输出流OutputStream
 * 6 使用网络字节输出流OutputStream对象中的write，给客户端会写数据
 * 7 释放资源（socket， ServerSocket）
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        // 1 create ServerSocket
        ServerSocket ss = new ServerSocket(8888);

        // 2 accept
        Socket socket = ss.accept();

        // 3 getData
        byte[] c = new byte[1024];
        InputStream fis = socket.getInputStream();
        int len = fis.read(c);
        System.out.println(new String(c, 0, len));

        // 4 getOutputStream
        OutputStream fos = socket.getOutputStream();
        fos.write("回写数据。。。".getBytes());

        // 5 close
        socket.close();
        ss.close();

    }
}
