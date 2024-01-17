package com.keduit;

public class _05_Circle {

	private double radius; // 10.0

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	double findArea() {
		return 3.14 * radius * radius;
	}
//                                          x                      y
	void show(double x, double y) { // circle.getRadius(), circle.findArea()
		System.out.printf("반지름 = %.1f, 넓이 = %.1f", x, y);
	}

}
