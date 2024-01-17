package com.keduits;

import java.util.stream.IntStream;

public class Exam03_RangeClosedTest {

	public static void main(String[] args) {

//		1부터 10까지 값을 가져오고
//		forEach : 1부터 10까지 출력하면서 앞에 A라는 char넣으면
//		출력 결과 : A1 A2 A3 A4 A5 A6 A7 A8 A9 A10 
		IntStream.rangeClosed(1, 10).forEach(s ->
		System.out.print("A"+ s + " "));
		

	}

}
