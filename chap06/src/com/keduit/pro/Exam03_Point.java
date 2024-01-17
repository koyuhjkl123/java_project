package com.keduit.pro;

public class Exam03_Point {

	private int x;
	private int y;

	public Exam03_Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	public String toString() {
		return "x의 좌표 : " + x + " y의 좌표 :" + y;
	}

}
