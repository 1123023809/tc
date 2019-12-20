package com.tc;

public class T2 {
 public static void main(String[]args) {
	byte b=1;
	short s=1;
	int i=1;
	long l=1l;
	float f=1.0f;
	double d=1.0;
	char c='a';
	short sc=97;
	char cc=97;
	
	boolean b1=true;
	boolean b2=false;
	
	System.out.println(c);
	System.out.println((char)sc);
	System.out.println(cc);
	
	System.out.println("字节型整型数据的长度是"+Byte.SIZE);
	System.out.println("短整型整型数据的长度是"+Short.SIZE);
	System.out.println("整型数据的长度是"+Integer.SIZE);
	System.out.println("长整型整型数据的长高度是"+Long.SIZE);
	System.out.println("单精度浮点型数据的长高度是"+Float.SIZE);
	System.out.println("双精度浮点型数据的长高度是"+Double.SIZE);
	
	System.out.println("字节型整型数据的取值范围是"+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE);
	System.out.println("短整型整型数据的取值范围是"+Byte.MIN_VALUE+"-"+Short.MAX_VALUE);
	System.out.println("整型数据的的取值范围是"+Byte.MIN_VALUE+"-"+Integer.MAX_VALUE);
	System.out.println("长整型整型数据的取值范围是"+Byte.MIN_VALUE+"-"+Long.MAX_VALUE);
	System.out.println("单精度浮点型数据的长高度是"+Byte.MIN_VALUE+"-"+Float.MAX_VALUE);
	System.out.println("双精度浮点型数据的长高度是"+Byte.MIN_VALUE+"-"+Double.MAX_VALUE);
	
	System.out.println("双精度浮点型数据的取值范围是"+Double.MIN_VALUE+"-"+Double.MAX_VALUE);
	System.out.println("字符型数据的取值范围是"+(int)Character.MIN_VALUE+"-"+(int)Character.MAX_VALUE);
	System.out.println("布尔型数据的取值范围是"+Boolean.FALSE+"-"+Boolean.TRUE);
}
}
