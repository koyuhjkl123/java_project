package com.keduit;

public class _04_Circle {
	
	private double radius;
	double findArea() {
		return 3.14 * radius * radius;
	}
	
	
	
	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}



	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}

}
