package com.keduit.pro;

public class Exam06_Car extends Exam06_Vehicle{

	int displacement; // 자동차 베기량
	int gears; // 자동차 기어단수
	
	public Exam06_Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}

	@Override
	void show() {
		System.out.println("자동차 색상 : " + color + " 자동차 속도 : " + speed +
			"자동차 베기량 : " + displacement + "자동차 기어 단수 : " + gears	 );
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}
	
	
	
}
