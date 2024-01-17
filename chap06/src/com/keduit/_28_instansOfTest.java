package com.keduit;

public class _28_instansOfTest {

	public static void main(String[] args) {
		
		_22_Student s = new _22_Student();
		
		_21_Person p = new _21_Person();
		
		
		System.out.println(s instanceof _21_Person);
		System.out.println(s instanceof _22_Student);
		System.out.println(p instanceof _22_Student);
//		System.out.println(s instanceof String); error
		
		downcast(s);

	}
	
	static void downcast(_21_Person p) {
		if(p instanceof _22_Student) {
			_22_Student s = (_22_Student) p; // downcasting
			System.out.println("OK, 하향 타입 변환");
		}
		
	}

}
