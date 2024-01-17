package com.keduit;

public class _07_PhoneTest {

	public static void main(String[] args) {
		
//		_05_Phone p = new _05_Phone("홍길동"); // 추상 클래스라 new 불가
		_06_SmartPhone smart = new _06_SmartPhone("홍길동");
		
		smart.turnOn();
		smart.internetSearch();
		smart.turnOff();
		
		
	}

}
