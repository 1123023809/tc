package com.school;

import javax.naming.event.NamespaceChangeListener;
import javax.print.attribute.standard.Sides;

public abstract class Test1 {
	public static void main(String[] args) {
		//创建对象:类名 对象名=new 构造方法;
		Student s1 = new Student();
		s1.setName("Pete");
		s1.setScore(600);
		System.out.println(s1.getName()+"考了"+s1.getScore());
		Student s2 = new Student("Mike",590);
		System.out.println(s2.getName()+"考了"+s2.getScore());
		
		Course c1= new Course();
		c1.setCourse_name("Java程序设计");
		c1.setCourse_book("Java基础入门");
		System.out.println(c1.getCourse_name()+"这门课使用的教材是"+c1.course_book);
		Course c2= new Course();
		c2.setCourse_name("语文");
		c2.setCourse_book("现代汉语");
		System.out.println(c2.getCourse_name()+"这门课使用的教材是"+c2.course_book);
	}
}
