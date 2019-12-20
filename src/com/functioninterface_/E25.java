package com.functioninterface_;

import java.awt.print.Printable;

@FunctionalInterface 
interface printable{
	void print(String str);
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class E25 {
	public static void main(String[] args) {
		StringUtils s = new StringUtils();
		printupper("hello",str->s.printUpperCase(str));
		printupper("hello",s::printUpperCase);
	}

	private static void printupper(String string, printable p) {
	p.print(string);
	}

}
