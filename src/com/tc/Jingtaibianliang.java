package com.tc;

import javax.xml.bind.annotation.W3CDomHandler;

class Student{
	static String schoolName;
	//
}
public class Jingtaibianliang {
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student.schoolName="江汉艺术职业学院";
		System.out.println("我是"+s1.schoolName+"的学生");
		System.out.println("我是"+s2.schoolName+"的学生");
	}
}
