package com.io;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E7_7 {
	public static void main(String[] args) throws IOException {
		FileWriter fileWriter=new FileWriter("E:\\writer.txt");
		fileWriter.write("轻轻的我走了,\r\n");
		fileWriter.write("正如我轻轻的来;\r\n");
		fileWriter.write("我轻轻的招手,\r\n");
		fileWriter.write("作别西天的云彩。\r\n");
		fileWriter.close();
	}
}
