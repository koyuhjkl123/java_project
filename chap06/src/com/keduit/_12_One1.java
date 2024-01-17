package com.keduit;



//같은 패키지에 안에 부모(One) 자식(One1)
public class _12_One1 extends _11_One {
	
	public _12_One1() {}
	void print() {
//		System.out.println(secret); 오류 아래 설명
		// 같은 패키지에 있는 자식 객체라도 부모 클래스의 private 멤버는 접근이 불가
		// private 외에 같은 패키지에 자식 객체는 모두 접근이 허용
		System.out.println(roommate); // default
		System.out.println(child); // protected
		System.out.println(anybody); // public
	}
	
//	public One1() {
////		super(); // 디폴트 생성자 !
////		super.anybody = 5; // 부모의 필드를 변경
//	}
	
//	void show() {} : 디폴트 show메서드, 부모는 public 이기때문에 접근지정자가 좁아지면 오류 발생

}
// 1. 