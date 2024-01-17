package com.keduits;

public class Exam01 {

	private double bese, hight;

	public Exam01(double bese, double hight) {
		this.bese = bese;
		this.hight = hight;
	}

	public double getBese() {
		return bese;
	}

	public double gethight() {
		return hight;
	}

	public double findArea() {
		return bese * hight * 0.5;
	}

}
