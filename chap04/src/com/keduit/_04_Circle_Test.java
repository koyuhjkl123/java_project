package com.keduit;

public class _04_Circle_Test {

	public static void main(String[] args) {
		
		_04_Circle myCircle = new _04_Circle();
		
		
		myCircle.setRadius(10.0); // 설정값
		
		myCircle.show(myCircle.getRadius(), myCircle.findArea());
		
//		myCircle.radius = 5.0;
//		myCircle.show(myCircle.radius, myCircle.findArea());

	}

}
