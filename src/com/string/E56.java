package com.string;

public class E56 {

	public static void main(String[] args) {
		String str="2019-10-12";
		
		System.out.println("从第6个字符截取到末尾的结果:"+str.substring(5));
		System.out.println("从第6个字符截取到第7个字符的结果:"+str.substring(5,7));
		
		System.out.print("分割后的字符串数组中的元素依次为:");
		
		String[] strArray=str.split("-");
		
		for(int i=0;i<strArray.length;i++) {
			if(i !=strArray.length-1) {
				System.out.print(strArray[i]+"、");
			}else {
				System.out.println(strArray[i]);
			}
		}
	}

}