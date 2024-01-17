package com.keduit;

public class _31_MemberClassTest {
	
	private String secret = "비공개";
	
	String s = "외부";
	
	class Memberclass{
		String s = "내부";
		
		public void show() {
			System.out.println("내부클래스");
			System.out.println(secret);
			System.out.println(s);
			System.out.println(_31_MemberClassTest.this.s);
		}
		
//		static String ss = "정적멤버"; 정적은 넣을 수 없다.
	}
	public void show() {
		System.out.println("외부클래스 메소드");
	}
	
	public static void main(String[] args) {
		
		_31_MemberClassTest t = new _31_MemberClassTest();
		// 외부안에 있는 내부 클래스 사용 할 경우 외부 클래스 생성 후 사용해야한다.
		t.show();
		
		_31_MemberClassTest.Memberclass t1 = t.new Memberclass();
//		외부클래스.내부클래스 변수 = 외부클래스참조변수.new 내부클래스
		t1.show();
		System.out.println(t1.s);
	}

}
