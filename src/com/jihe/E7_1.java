package com.jihe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E7_1 {
	public static void main(String[] args) throws IOException {
		FileInputStream in=new FileInputStream("E:\\test.txt");
		int b=0;
		while((b=in.read())!=-1){
			System.out.println(b);
		}
		in.close();
	}
}
