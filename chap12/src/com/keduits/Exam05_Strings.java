package com.keduits;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exam05_Strings {

	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		
//		1부터 5까지의 평균값
		double s1 = stream.collect(Collectors.averagingInt(value->value));
		System.out.println(s1);
		
//		stream 1회성이기때문에 변수명만 다른 재선언
		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
		
//		1부터 5까지의 제곱을 하고 평균값을 구한다.
		double s2 = stream1.collect(Collectors.averagingDouble(value-> value*value));
		System.out.println(s2);
		
		
		Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
		
//		stream2 map(값 + "" ) 문자열로 변환
//		변환 이유는 s3변수 타입이 String이면서 값이 숫자 Integer 이기때문에 문자열로 변환 후 출력을해야한다.
		String s3 = stream2.map(t -> t+"").collect(Collectors.joining("-"));
		System.out.println(s3);
	}

}
