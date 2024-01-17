package com.keduit;

public class _23_UpcastTest {

	public static void main(String[] args) {
		
		_21_Person p; // p = (_21_Person)s;
		
		_22_Student s = new _22_Student();

//		_21_Person : 부모 클래스
//		_22_Student : 자식 클래스
//		P 변수는 부모클래스에 타입
//		p = s; : 부모클래스의 타입인 p변수는 자식클래스인 s 객체를 참조한다.
//		그러나 부모 클래스 타입의 변수가 자식 클래스의 객체를 참조한다고 해서, 
//		부모 클래스에는 없는 자식 클래스의 특정 메서드나 필드에 직접적으로 접근하는 것은 불가능
		
		
		p=s;

		System.out.println(p.name);
		System.out.println(s.name);
		
		
	}

}
