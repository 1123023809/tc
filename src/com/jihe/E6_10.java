package com.jihe;

import java.util.HashSet;

class Student{
	String id;
	String name;
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return id.equals(id);
	}
	@Override
	public String toString() {
		return id +":" + name;
	}
}
public class E6_10{
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		Student stu1=new Student("1","Jack");
		Student stu2=new Student("2","Rose");
		Student stu3=new Student("3","tom");
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		System.out.println(hs);
	}
}