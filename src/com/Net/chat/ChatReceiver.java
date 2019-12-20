package com.Net.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatReceiver implements Runnable {
	private DatagramSocket client;
	private int targetPort;
	public ChatReceiver(DatagramSocket client, int targetPort) {
		this.client=client;
		this.targetPort=targetPort;
	}

	public ChatReceiver(DatagramSocket socket) {
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void run() {
		try {
			Scanner sc=new Scanner(System.in);
			while(true) {
				String 	data=sc.nextLine();
				byte[] buf=data.getBytes();
				DatagramPacket packet=new DatagramPacket(buf,buf.length,
						InetAddress.getByName("10.2.103.31"),targetPort);
				client.send(packet);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}

}
