package com.keduistest;

class Animal{ // 부모클래스
	public Animal(String s) {
		System.out.println("동물 : " + s); // 생성자가 있으므로 디폴트 생성자x
	}
}

class Mammal extends Animal { // Mammal 자식클래스 
	public Mammal() { // 디폴트 생성자
//		super(); 디폴트 생성자가 없어서 오류 발생
		super("원숭이"); // 부모 Animal 생성자 매개변수 s 전달
		System.out.println("포유류 : 원숭이");
	}
	
	public Mammal(String s) { // 매개변수 1개있는 생성자
		super(s); // Animal(부모)인 매개변수 s 전달
		
		System.out.println("포유류 : "+s);
	}
}

public class AnimalDemo {

	public static void main(String[] args) {
		
		Mammal ape = new Mammal();
		Mammal lion = new Mammal("사자");
		// 생성자 매개변수 1개 있는 s 에게 "사자" 라는 문자열을 전달한다.

	}

}
