package com.keduit;

public class User2 extends Thread{

	private _15_Calulator calulator;
	
	public void setCalulator(_15_Calulator calulator) {
		this.setName("User2");
		this.calulator  = calulator;
		
	}

	@Override
	public void run() {
		calulator.setMemory(200);
		
	}
}
