package com.interface_;

interface Animal{
	//接口中没有成员变量
	//只有public static final的成员常量
	//public static final三个关键字可以省略
	int ID=1;
	//abstract抽象
	//接口中的方法都是public abstract
	//public abstract两个关键字可以省略
	void shout();
	//接口里可以有静态非抽象的方法
	static int getID() {
		return Animal.ID;
	}
}
interface LanAnimal extends Animal{
	void run();
}

class Dog implements LanAnimal{
	@Override
	public void shout() {
		System.out.println("汪汪汪..");
	}
	public void run() {
		System.out.println("小狗在陆地上跑 ");
	}
}
public class E13{
	public static void main(String[] args) {
		Dog dog =new Dog();
		dog.shout();
		dog.run();
		System.out.println(Animal.getID());
	}
}