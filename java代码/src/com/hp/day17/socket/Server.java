package com.hp.day17.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8080);
		System.out.println("启动服务端");
		/**
		 * 监听客户端连接请求，如果客户端请求连接，返回一个已连接套接字
		 */
		Socket s = ss.accept();
		System.out.println("客户端"+s.getInetAddress().getLocalHost()+"端口号"+s.getLocalPort()+"连接到服务器");
	
		/**
		 * 客户端输出信息，服务端接收信息
		 * 客户端是输出流，服务端是输入流
		 * 客户端发送字节流，服务端把字节流转换成字符流，并包装成BufferedReader字符流
		 * BufferedReader:字符流，可以按行读：readLine方法，有缓存
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String info = br.readLine();
		System.out.println("客户端发送的信息是:"+info);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bw.write(info + "信息已收到\n");
		bw.flush();
		
		s.close();
		ss.close();
	}

}
