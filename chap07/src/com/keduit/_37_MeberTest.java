package com.keduit;

public class _37_MeberTest {
	
	class Eagle extends _36_Brid{

		@Override
		void move() {
			System.out.println("독수리가 날아감~");
		}
		
		public void sound() {
			System.out.println("휘익~~~");
		}
	}
	
	Eagle e = new Eagle();

	public static void main(String[] args) {

		
		_37_MeberTest m = new _37_MeberTest();
		
		m.e.move();// Eagle 클래스의 오버라이드된 move메소드 호출
		m.e.sound();
	}

}
