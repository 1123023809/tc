package com.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class tcp2 {
	public static void main(String[] args) throws Exception {
		Socket client=new Socket(InetAddress.getLocalHost(),7788);
		InputStream is =client.getInputStream();
		byte[]buf=new byte[1024];
		int len=is.read(buf);
		while(len!=-1);{
		System.out.println(new String(buf,0,len));
		len=is.read(buf);
		}
		is.close();
		client.close();
	}
}
