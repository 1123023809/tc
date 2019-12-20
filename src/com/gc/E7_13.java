package com.gc;

import java.io.File;
import java.util.Arrays;

public class E7_13 {
	public static void main(String[] args) {
		File file =new File("E:\\楠\\java基础\\java代码");
		if(file.isDirectory()) {
			String[]fileNames=file.list((dir,name)->name.endsWith(".txt"));
			Arrays.stream(fileNames).
			forEach(e->System.out.println(e));
		}
	}
}
