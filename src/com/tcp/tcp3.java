package com.tcp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class tcp3 {
public static void main(String[] args) throws UnknownHostException, IOException {
	Socket client=new Socket(InetAddress.getLocalHost(),10001);
	OutputStream out=client.getOutputStream();
	FileInputStream fis=new FileInputStream("D:\\1.jpg");
	byte[] buf=new byte[1024];
	int len=0;
	System.out.println("连接到服务器,开始文件上传！");
	while ((len=fis.read(buf))!=-1) {
		out.write(buf,0,len);
	}
	client.shutdownInput();
	InputStream is=client.getInputStream();
	byte[] bufMsg=new byte[1024];
	int len2=is.read(bufMsg);
	while(len2 !=-1) {
		System.out.println(new String(bufMsg,0,len2));
		len2=is.read();
	}
	out.close();
	is.close();
	fis.close();
	client.close();
}
}
