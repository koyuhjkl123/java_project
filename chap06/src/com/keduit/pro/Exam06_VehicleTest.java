package com.keduit.pro;


public class Exam06_VehicleTest {

	public static void main(String[] args) {
		
		Exam06_Car c = new Exam06_Car("파랑", 200, 1000, 5);

		c.show();
		
		System.out.println();
		Exam06_Vehicle v = c;
		v.show(); 
		// 부모클래스에 있는 메서드가 호출되지 않고 자식클래스 메소드 호출은
//		자식클래스에서 오버라이딩된 메소드가 있어서 자식클래스의 메소드가 출력
	}

}
