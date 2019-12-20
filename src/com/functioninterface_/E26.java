package com.functioninterface_;
@FunctionalInterface
interface PersonBuilder{
	 Person buildPerson(String name);
}
//定义一个Person类，并添加有参构造方法

class Person{
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
}
//定义测试类
public class E26 {
	public static void printNmane (String name,PersonBuilder builder) {
		System.out.println(builder.buildPerson(name).getName());
	}
	public static void main(String[]args) {
		printNmane ("刘德华",new PersonBuilder() {
			
			@Override
			public Person buildPerson(String name) {
				// TODO 自动生成的方法存根
				return new Person("刘德华");
			}
		});
		//使用Lambda表达方式
		printNmane("郭富城", name->new Person(name));
		//使用构造引用方式
		printNmane("张学友", Person::new);
	}
}

