package com.keduit;

public class _23_ControllableTest {

	public static void main(String[] args) {
		
		_15_Controllable[] controllable = {new _17_TV(), new _19_Computer()
				};
		
		for (_15_Controllable c: controllable) {
			c.turnOn();
			c.turnOff();
			c.repair();
//			_17_Tv 클래스의 repair() 재정의 된것이 없기 때문에 
		}
		
		_15_Controllable.reset();
		

	}

}
