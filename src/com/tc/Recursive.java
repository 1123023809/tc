package com.tc;
public class Recursive {
	//递归求和
	//在方法的内部自己调用自己,就叫方法的递归,一般来说参数值不一样
	public static int getSum(int n) {
		//最终参数值
		if(n==1)return 1 ;
				
		int temp = getSum(n-1);
		return temp+n;
	}
	public static void main(String[] args) {
		System.out.println("1到100的和是"+getSum(100));
	}
}
