package com.tc;

public class T3 {

		public static void main(String[]args) {
			//自动类型转换
			byte b=3;
			int i=b;
			System.out.println("整型变量i的值是"+i);
			//强制类型转换
			int i2=3;
			byte b2=(byte)i2;
			System.out.println("字节型变量b2的值是"+b2);
		}
}
