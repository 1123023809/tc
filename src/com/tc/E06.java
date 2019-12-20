package com.tc;

public class E06 {
	public static void main(String[] args) {
		int x=0;					//定义变量x,初始值为0
		int y=0;					//定义变量z,初始值为0
		int z=0;					//定义变量y,初始值为0
		boolean a,b;				//逻辑运算符&对表达式进行运算,然后将结果赋值给a
		a=x>0 & y++>1;
		System.out.println("a="+a);
		System.out.println("y="+y);
		b=x>0 && z++>1;				//逻辑运算符&对表达式进行运算,然后将结果赋值给b
		System.out.println("b="+b);
		System.out.println("z="+z);
		
		//条件运算符
		int store=101;
		System.out.println(store<=0?"没有库存了":store>100?"库存太多了":"库存量是"+store);
	}
}
