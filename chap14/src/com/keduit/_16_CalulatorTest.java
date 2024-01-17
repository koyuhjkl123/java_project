package com.keduit;

public class _16_CalulatorTest {

	public static void main(String[] args) {
		
		
		_15_Calulator calulator = new _15_Calulator();
		
		User1 user1 = new User1();
		user1.setCalulator(calulator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalulator(calulator);
		user2.start();
		
		

	}

}
