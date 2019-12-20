package com.api;

public class Math_test {
	public static void main(String[] args) {
		System.out.println("计算绝对值的结果："+Math.abs(-100));
		System.out.println("计算余弦的结果："+Math.sin(2.0));
		System.out.println("计算正弦的结果："+Math.cos(1.44));
		System.out.println("计算正切的结果："+Math.tan(0.4));
		System.out.println("计算平方根的结果："+Math.sqrt(100));
		System.out.println("计算立方根的结果："+Math.cbrt(8));
		System.out.println("计算乘方的结果："+Math.pow(2, 4));
		System.out.println("求大于参数的最小整数："+Math.ceil(2.100));
		System.out.println("求大于参数的最大整数："+Math.ceil(-5.100));
		System.out.println("对小数进行四舍五入的结果："+Math.round(-8.4));
		System.out.println("求两个数的较大值："+Math.max(0.1,0.2));
		System.out.println("求两个数的较小值："+Math.min(0.01,0.05));
		System.out.println("生产一个大于等于0.0小于1.0的随机值："+Math.random());
	}
}
