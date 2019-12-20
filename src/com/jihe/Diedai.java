package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class Diedai {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("s1");
		list.add("s2");
		list.add("s3");
		list.add("s4");
		Iterator diedai=list.iterator();
		while (diedai.hasNext()) {
			String mgys=(String) diedai.next();
			System.out.println(mgys);
			
		}
	}
}
