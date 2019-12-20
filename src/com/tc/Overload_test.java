package com.tc;


public class Overload_test {
	public static void main(String[] args) {
		System.out.println(Overload.add(3,5));
		System.out.println(Overload.add(3,5,6));
			
		Overload o1=new Overload();
		System.out.println(Overload.add(3.1,5.2));
		}
	}


