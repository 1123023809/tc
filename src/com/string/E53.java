package com.string;

public class E53 {
	public static void main(String[] args) {
		String str="java1f我5h071f爱8d9中a6国s83a4";
		char[] charArray=str.toCharArray();
		/*System.out.println("将字符串转为字符数组的遍历结果:");
		for(char zf : charArray) {
			if(str.endsWith(""+zf))
				System.out.println(zf);
			else
				System.out.println(zf+",");
		}*/
		System.out.print("将字符串转为字符数组的遍历结果:");
		for (int i=0;i<charArray.length;i++) {
		if(i !=charArray.length-1) {
			System.out.print(charArray[i]+",");
			}else {
				System.out.println(charArray[i]);
			}
		}
		System.out.print("字符串中的数字是:");
			for(char str1:charArray) {
				if(str1>='0'&&str1<='9') {
					System.out.print(str1);
			}
		}
		System.out.print("字符串中的汉字是:");
			for(char str1:charArray) {
				if(str1>='\u4E00'&&str1<='\u9FA5') {
					System.out.print(str1);
			}
		}
		System.out.println("将int值转换为String类型之后的结果:"+String.valueOf(12));
		System.out.println("将字符串转换成大写之后的结果:"+str.toUpperCase());
	}
}