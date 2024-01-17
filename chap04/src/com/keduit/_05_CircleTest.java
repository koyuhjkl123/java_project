package com.keduit;

public class _05_CircleTest {

	public static void main(String[] args) {
		
		_05_Circle circle = new _05_Circle();
		
		circle.setRadius(10.0);
		circle.show(circle.getRadius(), circle.findArea());
		
		String string = "r";
		
		System.out.println(string.equals("r"));
	}
}
