package com.keduitts;

public class _03_Circle {
	
	public double radius;
	public static double PI = 3.141592;
	
	public _03_Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius *PI;
	}

}
