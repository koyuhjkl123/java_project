package com.keduit;

public class _14_SynchroTest {

	public static void main(String[] args) {
		
		_13_SharedCar car = new _13_SharedCar();
		
		new CarThread("홍길동", car, "강남").start();
		new CarThread("한정교", car, "부산").start();
		new CarThread("김길동", car, "대전").start();
		new CarThread("박길동", car, "서울").start();
		new CarThread("금길동", car, "울산").start();
		new CarThread("개길동", car, "세종").start();
		
		
		
		

	}

}
