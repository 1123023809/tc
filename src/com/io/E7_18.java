package com.io;

import java.nio.CharBuffer;

public class E7_18 {

	public static void main(String[] args) {
		CharBuffer cBuffer=CharBuffer.allocate(6);
		System.out.println("缓冲器容量是"+cBuffer.capacity());
		System.out.println("缓冲器界线值是"+cBuffer.limit());
		System.out.println("缓冲器初始位置是"+cBuffer.position());
		cBuffer.put('a');
		cBuffer.put('b');
		cBuffer.put('c');
		System.out.println("缓冲器界线值是"+cBuffer.limit());
		System.out.println("缓冲器初始位置是"+cBuffer.position());
		
		//反转
		cBuffer.flip();
		System.out.println("反转之后缓冲器容量是"+cBuffer.capacity());
		System.out.println("反转之后缓冲器界线值是"+cBuffer.limit());
		System.out.println("反转之后缓冲器初始位置是"+cBuffer.position());
		System.out.println("反转之后取出缓冲器的第一个值是"+cBuffer.get());
		System.out.println("反转之后并取出的第一个缓冲器界线值是"+cBuffer.limit());
		System.out.println("反转之后并取出的第一个缓冲器初始位置是"+cBuffer.position());
		
		//清除
		System.out.println("清除后缓冲器容量是"+cBuffer.capacity());
		System.out.println("清除后缓冲器界线值是"+cBuffer.limit());
		System.out.println("清除后缓冲器初始位置是"+cBuffer.position());
		System.out.println("清除后取出缓冲器的第一个值是"+cBuffer.get());
		System.out.println("清除后并取出的第一个缓冲器界线值是"+cBuffer.limit());
		System.out.println("清除后并取出的第一个缓冲器初始位置是"+cBuffer.position());
	}

}