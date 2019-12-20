package com.abstract_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class E622 {
	public static void main(String[] args, Writer out) throws IOException {
		Properties pps = new Properties();
		pps.load(new FileInputStream("test.properties"));
		pps.forEach((k,v)->System.out.println(k+"="+v));
		FileOutputStream out1 =new FileOutputStream("test.properties");
		pps.setProperty("charset","UTF-8");
		pps.store(out1, "新增charset编码");
	}
}
