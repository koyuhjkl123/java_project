package com.keduit;

public class _05_SupersonicAiplan extends _04_Airpane{

	public static final int Nomal = 1;
	public static final int SUPERSONIC = 2;
	
	
	public int flyMode = Nomal;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly(); // _04_Airpane클래스인 fly() 메서드를 호출한다.
		}
	}
	
	
	
	
	
}
