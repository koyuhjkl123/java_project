package com.keduit;

public class _39_Anonymous {

	_36_Brid b = new _36_Brid() {
		// 기명 지역 클래스
		@Override
		void move() {
			System.out.println("독수리가 날아요");
		}

		void sound() {
			System.out.println("휘익~");
		}

	};

	public static void main(String[] args) {

		_39_Anonymous a = new _39_Anonymous();
		
		a.b.move();
//		a.b.sound(); _36_Brid 클래스를 _36_Brid 타입으로 생성했기 때문에
//		익명에서 추가된 sound() 메소드는 출력되지 않음
	}

}
