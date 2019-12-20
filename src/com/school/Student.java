package com.school;

public class Student {
	//定义两个成员的变量
	//private:类可见性 当前属性只能在本类中被访问
	//将成员变量定义为私有的,就是类的封装
	//外部方法要访问这个成员变量,必须通过公有的getter setter方法
	public String name;
	//没有修饰符:包可见性 当前属性只能在本包中被访问
	public int score;
		//如果有了带参数的构造方法,jaja虚拟机将不会自动创建一个无参的构造方法
		//如果没有定义的任何构造方法:java虚拟机会自动创建一个无参的构造方法
		//不管什么情况,都会个给类添加一个无参数的构造方法
		//定义无参的构造方法:
		//构造方法是一种特殊的方法:修饰符+类名([参数类型 参数名]){}
		public Student(){}
		public Student(String name, int score) {
			this.name = name;
			this.score = score;
		}
		//2对个体特瑞 setter方法
		public String getName() {
			return name;
		}
		public void setName(String string) {
			this.name = string;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
}