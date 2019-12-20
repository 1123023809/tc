package com.Net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receiver_UDP {

	public static void main(String[] args) throws IOException {
		DatagramSocket server=new DatagramSocket(8900);
		byte[]buf=new byte[1024];
		DatagramPacket packet=new DatagramPacket(buf, buf.length);
		System.out.println("等待数据接收...");
		while(true) {
			server.receive(packet);
			String string=new String(packet.getData(),0,packet.getLength());
			System.out.println(packet.getAddress()+":"+packet.getPort()+"发送消息:"+string);
		}
	}

}
