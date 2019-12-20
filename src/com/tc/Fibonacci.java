package com.tc;

public class Fibonacci {
	public static int F(int n) {
		if(n==1) return 1;
		if(n==2) return 2;
		//F(n)=F(n-1)+F(n-2)
		return F(n-1)+F(n-2);
		}
	public static void main(String[] args) {
		System.out.println("Fibonacci sequence的第50个数是"+F(50));
	}
}
 