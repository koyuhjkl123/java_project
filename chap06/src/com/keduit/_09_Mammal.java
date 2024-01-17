package com.keduit;

public class _09_Mammal extends _08_Animal {
	public _09_Mammal() {
//		super(); 디폴트 생성자가 없어서 오류 발생
		super("원숭이"); // 부모 Animal 생성자 매개변수 s 전달
		System.out.println("포유류 : 원숭이");
	}

	public _09_Mammal(String s) {
		super(s); // Animal(부모)인 매개변수 s 전달
		System.out.println("포유류 : " + s);
	}
}