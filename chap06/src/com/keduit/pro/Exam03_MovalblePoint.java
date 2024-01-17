package com.keduit.pro;

public class Exam03_MovalblePoint extends Exam03_Point{
	
	private int xSpeed;
	private int ySpeed;
	
	Exam03_MovalblePoint(int x, int y, int xSpeed, int ySpeed){
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}
	
	public String toString() {
		return " x의 좌표 : " + super.getX() + " y의 좌표 :" + super.getY()
		+ " x의 이동속도 : " + xSpeed + " y의 이동속도 " + ySpeed; 
	}

}
