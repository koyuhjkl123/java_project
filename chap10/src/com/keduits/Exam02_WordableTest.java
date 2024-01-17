package com.keduits;

public class Exam02_WordableTest {

	public static void main(String[] args) {

		
		Exam02_Wordable[] m = {

//				Exam02_Wordable인터페이스의 word()메서드 구현체
				() -> System.out.println("가위"), 
				() -> System.out.println("나비"), 
				() -> System.out.println("다리"),
				() -> System.out.println("마차") };

//		향상된 for문으로 mm.word()을 출력
		for (Exam02_Wordable mm : m) {
			mm.word();
		}

	}
}
