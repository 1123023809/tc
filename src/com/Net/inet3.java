package com.Net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class inet3 {
	public static void main(String[] args) throws IOException {
		DatagramSocket client=new DatagramSocket(3000);
		String str="来自谭冲的问候";
		byte[] hcqsz=str.getBytes("UTF-8");
		DatagramPacket packet=new DatagramPacket(str.getBytes(),str.getBytes().length,InetAddress.getByName("10.2.103.31"),8900);
		System.out.println("开始发送信息.....");
		client.send(packet);
		client.close();
	}
}
