package com.Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class inet1 {

	public static void main(String[] args) throws Exception {
	InetAddress localAddress=InetAddress.getLocalHost();
	InetAddress remoteAddress=
			  localAddress.getByName("www.itcast.com");
	System.out.println("本机的IP地址为:"+localAddress.getHostAddress());
	System.out.println("itcast的IP地址为:"+remoteAddress.getHostAddress());
	System.out.println("3秒内是否可以访问:"+remoteAddress.isReachable(3000));
	System.out.println("itcast的主机名为:"+remoteAddress.getHostName());
	}

}
