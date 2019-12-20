package com.tostring;
//定义animal类
class Animal{
	final String name="动物";
	void shout() {
		System.out.println("动物叫");
	}
}
class  Animal1 extends java.lang.Object {
@Override
public String  toString() {
	return"这是一只动物";
}
}
class Dog extends Animal{
@Override
public String toString() {
	return"这是一只二哈";
}
}
//定义测试类
public class E06{
	public static void main(String[] args) {
		Animal dw=new Animal();
		Dog wd=new Dog();
		System.out.println(dw.toString());
		System.out.println(wd.toString());
	}
}