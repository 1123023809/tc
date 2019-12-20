package com.jihe;

import java.util.stream.Stream;

public class E6_38 {
	public static void main(String[] args) {
		Stream<String>stream=Stream.of("齐","楚","燕","韩","赵","卫","秦");
		stream.skip(0).limit(7).forEach(System.out::println);
	}
}
