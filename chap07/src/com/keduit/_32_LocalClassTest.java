package com.keduit;

public class _32_LocalClassTest {
	
	private String s1 = "외부"; // 외부 클래스 필드
	
	void method() { // 외부클래스의 메소드
		int x = 1; // 지역변수
		
		class Localclass{ // 지역 클래스
			String s2 = "내부"; // 지역 클래스의 필드
			String s3 = s1;
			
			public void show() { // 지역클래스의 메소드
				System.out.println("지역클래스");
//				x = 10; // error
			}
		}
		Localclass lc = new Localclass(); // 내부클래스 생성
		System.out.println(lc.s2); // 내부 클래스의 s2 필드
		lc.show(); // 내부 클래스에 있는 메소드 출력
	}

	public static void main(String[] args) {
		_32_LocalClassTest lct = new _32_LocalClassTest();
		lct.method();
		
	}

}
