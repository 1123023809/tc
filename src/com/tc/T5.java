package com.tc;

public class T5 {
	public static void main(String[] args) {
		//算数运算符++
		int i=1;
		int j=1;
		System.out.println("先加表达式的值等于变量的值加1，也就是"+(++j));
		System.out.println("后加表达式的值等于变量的值,与就是"+(i++));
		System.out.println("不管是先加还是后加,变量的值都加了1,也就是"+j);
		int a=2;
		a+=3;
		System.out.println("a="+a);
		//比较运算符 == 返回一个布尔值
		String s1="hello";
		String s2="hello";
		System.out.println(s1==s2);
		Test_tc t1=new Test_tc();
		Test_tc t2=new Test_tc();
		System.out.println(t1==t2);
	}
}
