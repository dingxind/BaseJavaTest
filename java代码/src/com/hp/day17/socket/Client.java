package com.hp.day17.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception{
		Socket s = new Socket("127.0.0.1", 8080);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bw.write("明天是元宵节\n");
		bw.flush();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String returnInfo = br.readLine();
		System.out.println("服务端反馈信息是:"+returnInfo);
		
		s.close();
	}

}
