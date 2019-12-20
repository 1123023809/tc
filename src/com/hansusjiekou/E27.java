package com.hansusjiekou;

import java.util.StringTokenizer;

@FunctionalInterface
interface Printable{
	void print(StringUtils su, String str);
}
class StringUtils{
	public void printUpperCase( String str) {
		System.out.println(str.toUpperCase());
		
	}
}
public class E27 {
	private static void printUpper (StringUtils su, String text,Printable pt) {
		pt.print(su, text);
	}
	public static void main(StringTokenizer[] args) {
		printUpper(new StringUtils(),"Hello", (Object,t)->Object.printUpperCase(t));		
		printUpper(new StringUtils(),"Hello",StringUtils::printUpperCase);

	}
}