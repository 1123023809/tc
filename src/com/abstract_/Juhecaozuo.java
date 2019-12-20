package com.abstract_;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Juhecaozuo {
	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("湖人");
		list.add("湖泊");
		list.add("张勇士");
		list.add("张火箭");
		Stream<String>stream=list.stream();
		Stream<String>stream2=stream.filter(i->i.startsWith("湖"));
		Stream<String>stream3=stream2.limit(2);
		stream3.forEach(j->System.out.println(j));
		System.out.println("=======");
		
		list.stream().filter(i->i.startsWith("湖")).limit(2)
		.forEach(i->System.out.println(i));
		stream.filter(i->i.startsWith("张"))
		.filter(i->i.length()>3)
		.forEach(System.out::println);
	}
}