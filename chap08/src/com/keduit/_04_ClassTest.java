package com.keduit;

public class _04_ClassTest {

	public static void main(String[] args) {
		
		_02_keyboard k = new _02_keyboard("Logutech");
		
		Class c = k.getClass();
		
		System.out.println(c.getName()); // 패키지.클래스명
		System.out.println(c.getSimpleName()); // 패키지 않주고 클래스명만
		
		System.out.println(c.getTypeName()); // 패키지.클래스명
		System.out.println(c.getPackage().getName()); // 패키지만 가져옴
		
	}
}
