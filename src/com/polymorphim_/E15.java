package com.polymorphim_;
abstract class Animal{
	public abstract void shout();
}
class Cat extends Animal{
	@Override
	public void shout() {
		System.out.println("喵喵喵");
	}
	public void catchMouse() {
		System.out.println("猫抓老鼠");
	}
}
class Dog extends Animal{
	@Override
	public void shout() {
		System.out.println("汪汪汪");
	}
}
public class E15 {
	public static void main(String[] args) {
		Animal an1=new Cat();
		an1.shout();
		Animal an2=new Dog();
		an2.shout();
		if(an1 instanceof Cat) {
			Cat mao=(Cat)an1;
			mao.catchMouse();
		}else {
			System.out.println("该类型的对象不是Cat类型");
		}
		if (an2 instanceof Cat) {
			Cat mao=(Cat)an1;
			mao.catchMouse();
		}else {
			System.out.println("该类型的对象不是Cat类型");
		}
	}
}
