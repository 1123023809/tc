package com.jihe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propeties_test {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties sxj=new Properties();
		sxj.load(new FileInputStream("E:\\css"));
		sxj.forEach((key,value)->System.out.println(key+":"+value));
	}
}
