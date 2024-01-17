package com.keduit;

public class _07_CircleTest {

	public static void main(String[] args) {
		
		_07_Circle c1 = new _07_Circle(); // 디폴트 생성자
		
		c1.print();
		
		_07_Circle c2 = new _07_Circle(10.0);
		
		c2.print();
		
		_07_Circle c3 = new _07_Circle("Yellow");
		
		c3.print();
		
		_07_Circle c4 = new _07_Circle(25.0, "green");
		
		c4.print();

	}

}
