package com.keduit;

public class _13_BoxTest {

	public static void main(String[] args) {
		
		_12_Box b1 = new _12_Box();
		_12_Box b2 = new _12_Box();
		
		b1.setOb(new _10_Apple());
		_11_Orange o = new _11_Orange();
		b2.setOb(o);
		
		_10_Apple apple = (_10_Apple)b1.getOb();
		_11_Orange orange = (_11_Orange)b2.getOb();

		
		System.out.println(apple);
		System.out.println(orange);
	}

}
