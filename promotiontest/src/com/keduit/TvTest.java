package com.keduit;

class Animal {

	int animal;
}

class Dog extends Animal {
	int dogs;
}

class Cat extends Animal {
	int cas;
}

public class TvTest extends Tv{
	
	int more;
	int more2;

	public static void main(String[] args) {
//		Tv tv = new Tv();
//		Tv test = new TvTest(); // 조상 참조변수 = new 자손 5 < 7
////		TvTest test1 = new Tv(); // 자손 참조변수 = new 조상 에러
//		
//		tv.Power(false);
//		tv.channel = 7;
//		tv.Channel_Up(3);
//		tv.Channel_Down(5);
//		
//		
//		test.Channel_Down(3);
//		test.channel = 3;
//		test.Power(true);
//		test.Channel_Up(3);
//		test.power = false;
//		
////		test.more = 12; // 자식클래스인 필드는 사용 못함
//		
//		
//		System.out.println("현재 채널은 : " + tv.channel);
		
		
//		다형성 : Animal animal = new Dog(); 부모클래스의 타입인 animal 변수 이자
//		자식클래스의 객체를 바라보는 변수이다.
//		여러 자식클래스, 새로운 자식클래스 할 수도 있다.
//		상속과 다형성은 높은 연관성이 있는 개념에서 주로 발생하지만
//		인터페이스, 추상화 등으로도 구현이 가능하다
		Animal animal = new Dog();

		if(animal instanceof Dog)
		{
			System.out.println(animal instanceof Dog);
		}else if(animal instanceof Cat)
		{
			System.out.println("This is a Cat!");
		}else
		{
			System.out.println("This is another type of Animal.");
		}
	}

}
