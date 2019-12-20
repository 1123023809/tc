package com.api;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Test test=new Test();
		ArrayList arrayList=new ArrayList<>();
		long kssj1=System.currentTimeMillis();
		test.listTest(arrayList);
		long jssj1=System.currentTimeMillis();
		System.out.println("用arrayList插入150000个元素要消耗"+(jssj1-kssj1)+"毫秒");
		
		
		LinkedList linkedList=new LinkedList<>();
		long kssj2=System.currentTimeMillis();
		test.listTest(linkedList);
		long jssj2=System.currentTimeMillis();
		System.out.println("用LiList插入150000个元素要消耗"+(jssj2-kssj2)+"毫秒");
	
		
	}
}
class Test{
	public void listTest(List list) {
		Random random=new Random();
		for(int i=0;i<150000;i++) {
			list.add(0,i);
		}
	}
}