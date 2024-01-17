package com.keduit;

public class CarThread extends Thread{

	
	private String who;
	private _13_SharedCar car;
	private String where;
	
	
	public CarThread(String who, _13_SharedCar car, String where) {
		this.who = who;
		this.car = car;
		this.where = where;
	}


	@Override
	public void run() {
		car.drive(who, where);
	}
	
	
	
}
