package com.tc;

public class P24 {
	public static void main(String[] args) {
		int a[]= {9,8,3,5,2};
		System.out.println("数组a的长度是"+a.length);
		System.out.println("初始数组各个元素是:");
		for (int i=0; i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println();
		for(int i=1; i <a.length;i++) {
			for(int j=0; j <a.length-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("\n冒号排序结束后数组各个元素是:");
		for(int xiaoa:a) 
			System.out.println(xiaoa+" ");	
	}
}
