package com.keduits;

public class Exam04_TalkableTest {
	
	static void speak(Exam04_Talkable ls) {// Exam04_Talkable 타입인 ls 참조 매개변수
		ls.talk();
//		Exam04_Talkable 인터페이스의 메서드를 Exam04_Korean, Exam04_American
//		구현했기 때문에 new Exam04_Korean, new Exam04_American 객체를 가리키는 참조변수로 불러올 수 있다.
	}
	
	public static void main(String[] args) {
		
		speak(new Exam04_Korean()); // 객체를 생성하여 speak메서드 인자 값에 참조
		speak(new Exam04_American()); // 객체를 생성하여 speak메서드 인자 값에 참조
	}

}
