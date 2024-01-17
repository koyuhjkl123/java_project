package com.keduit;

public class _30_MovableTest {

	public static void main(String[] args) {

		_28_Movable m = new _29_Car();

		m.move(0);
//		m.show(); error

		_29_Car c = (_29_Car) m; // 다운캐스팅
		c.move(5);
		c.show();
		
	}

}
