package com.keduit;

public class _41_Anonymous {
	
	_40_Person field = new _40_Person() { // 익명 객체

		@Override
		void wake() { // 익명 객체에서 오버라이드된 메소드
			System.out.println("6시에 일어납니다.");
			work();
		}
		
		void work() { // 익명 객체에서 추가된 메소드
			System.out.println("일합니다.");
		}
		
	};
	void method1() { // 외부 클래스에 있는 메소드
		_40_Person localVar = new _40_Person() { // 익명 객체

			// 익명 객체에서 오버라이드된 메소드
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
			// 익명 객체에서 추가된 메소드
			void walk() {
				System.out.println("산책을 합니다.");
			}
		};
		localVar.wake();
	}
	
	void method2(_40_Person person) { // 메소드(_40_Person의 매개변수
		person.wake();
	}
	

}
