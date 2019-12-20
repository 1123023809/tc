package com.jicheng;

class Animal {
	String name;
	public Animal() {
		System.out.println("我是一只动物");
	}
	public Animal(String name) {
		System.out.println("我是一只"+name);
	}
	void shout(){
		System.out.println("动物发出叫声");
	}
}
//定义dog类继承Animal类
class Dog extends Animal{
	public Dog() {
		super("二哈");
	}
	public Dog(String name) {
		super("二哈");
	}
	//继承了类的所有可以继承的方法和成员变量
	void printName() {
		System.out.println("name="+name);
	}
	@Override//重写 前面override是注解
	void shout() {
		super.shout();
		System.out.println("汪汪..");
	}
}
public class P105{
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.name="二哈";
		dog.printName();
		dog.shout();
	}
}
