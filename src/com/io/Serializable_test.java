package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializable_test {

	public static void main(String[] args) throws Exception{
		Person p1=new Person();
		FileOutputStream fout=new FileOutputStream("person.txt");
		ObjectOutputStream oout=new ObjectOutputStream(fout);
		oout.writeObject(p1);
		ObjectInputStream oni=new ObjectInputStream(new FileInputStream("person.txt"));
		Person p=(Person) oni.readObject();
		System.out.println(p);

	}

}