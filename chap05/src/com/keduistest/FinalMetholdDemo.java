package com.keduistest;

class Chess{
	enum ChessPlayer { // 열겨형 타입
		WHITE, BLACK // 상수
	}
	
	final ChessPlayer getFirstPlayer() { // final 메서드
		return ChessPlayer.WHITE;
	}
}
class worldChess extends Chess {
//	ChessPlayer getFirstPlayer() {}
	// getFirstPlayer()는 final 메서드이기 때문에 오버라이딩 하면 오류가 발생
}

public class FinalMetholdDemo {

	public static void main(String[] args) {
		
		worldChess w = new worldChess();
		
		w.getFirstPlayer(); // 부모 클래스에 있는 final 메소드 있는 그대로 사용

	}

}
