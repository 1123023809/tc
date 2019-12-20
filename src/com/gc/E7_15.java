package com.gc;

import java.io.File;
import java.io.FileDescriptor;

public class E7_15 {

	public static void main(String[] args) {
		File file=new File("E:\\楠\\java基础\\java代码");
		fileDir(file);

	}
	public static void fileDir(File file) {
		File[] listFiles=file.listFiles();
		for(File files:listFiles) {
			if(files.isDirectory()) {
				fileDir(files);
			}
			System.out.println(files);
		}
}
}