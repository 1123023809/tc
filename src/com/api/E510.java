package com.api;

public class E510 {
	public static void main(String[] args) {
		long kssj=System.currentTimeMillis();
		long sum=0;
		for(long i=0; i < 10000000000l; i++) {
			sum+=1;
		}
		long jssj=System.currentTimeMillis();
		System.out.println("从1加到100亿耗时"+(jssj-kssj)+"毫秒");
	}
}
