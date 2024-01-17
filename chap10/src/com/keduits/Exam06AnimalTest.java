package com.keduits;

import java.util.function.Supplier;

public class Exam06AnimalTest {

	static void soundAnimal(Supplier<Exam06_Animal> s) {
//		Supplier 함수형인터페이스를 활용하여 sound메서드 호출
//		get() 추상 메서드 1개
//		main 메서드에서 구현체 코딩하여 객체를 반환
		s.get().sound();
		
//		s가 Exam06_Animal 일 경우
//		get() 메서드는 Exam06_Animal 반환하며, 그걸통안 Exam06_Animal의 메서드가 호출된다.
	}

	public static void main(String[] args) {
		
//		람다식 구현체를 활용하기 위해 생성자 호출
		Exam06_Animal n1 = new Exam06_Animal();
		Exam06_Animal n2 = new Exam06_Dog();
		
//		Exam06_Animal 클래스의 객체를 sup1를 대입
		Supplier<Exam06_Animal> sup1 = ()-> n1;
//		sup1 : Exam06_Animal 객체를 참조하기 있기 때문에 s매개변수에게 전달
		soundAnimal(sup1);
		
		
		Supplier<Exam06_Animal> sup2 = ()-> n2;
		soundAnimal(sup2);
		
	}

}
