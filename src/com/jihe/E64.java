package com.jihe;

import java.util.ArrayList;

public class E64 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		list.add("data_4");
		for (Object obj:list) {
			System.out.println(obj);
		}
	}
}