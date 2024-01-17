package com.keduit;

public class _06_SuperSonicAirplamTest {
	

	public static void main(String[] args) {

		_05_SupersonicAiplan sa = new _05_SupersonicAiplan();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode= _05_SupersonicAiplan.SUPERSONIC; // 2
		sa.fly(); // 2 == 2 true 이기 때문에 초음속 비행
		
		sa.flyMode = _05_SupersonicAiplan.Nomal; // 1
		sa.fly(); // 1 == 2 false 이기 때문에 일반 비행
		sa.Isnd(); // 착류합니다.
	}

}
