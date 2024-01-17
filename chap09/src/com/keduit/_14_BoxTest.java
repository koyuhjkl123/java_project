package com.keduit;

public class _14_BoxTest {

	public static void main(String[] args) {
		
		_12_Box  aBox = new _12_Box();
		_12_Box oBox = new _12_Box();
		
		aBox.setOb("Apple");
		oBox.setOb("orange");
		
		_10_Apple apple = (_10_Apple)aBox.getOb();
		_11_Orange orange = (_11_Orange)oBox.getOb();
		
		System.out.println(apple);
		System.out.println(orange);
		

	}

}
