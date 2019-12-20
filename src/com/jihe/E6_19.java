package com.jihe;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class CustomComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO 自动生成的方法存根
		String key1=(String) o1;
		String key2=(String) o2;
		return key2.compareTo(key1);
	}
	
}

public class E6_19 {
	public static void main(String[] args) {
		Map map=new TreeMap();
		map.put("1","arrow");
		map.put("4","arrows");
		map.put("3","arrowt");
		System.out.println(map);
		
		Map map1=new TreeMap(new CustomComparator());
		map1.put("2","arrow");
		map1.put("4","arrows");
		map1.put("3","arrowt");
		System.out.println(map1);
		
	}
}