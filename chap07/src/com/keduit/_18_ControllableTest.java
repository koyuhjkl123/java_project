package com.keduit;

public class _18_ControllableTest {

	public static void main(String[] args) {

		_17_TV tv = new _17_TV();
		tv.turnOn();
		tv.turnOff();
		tv.repair();
		
		_19_Computer pc = new _19_Computer();
		pc.turnOn();
		pc.turnOff();
		pc.repair();
		
		_15_Controllable.reset();
	}

}
