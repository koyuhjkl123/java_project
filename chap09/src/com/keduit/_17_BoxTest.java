package com.keduit;

public class _17_BoxTest {

	public static void main(String[] args) {
		
		_16_Box<_10_Apple> aBox = new _16_Box<>();
		_16_Box<_11_Orange> oBox = new _16_Box<>();
		
		aBox.set(new _10_Apple());
		oBox.set(new _11_Orange());
		
		_10_Apple apple = aBox.get();
		_11_Orange orange = oBox.get();
		
		
		System.out.println(apple);
		System.out.println(orange);
		

	}

}
