package com.keduit;

public class _03_InheritanceTest {

	public static void main(String[] args) {
		
		_01_Circle c1 = new _01_Circle();
		
		_02_Ball c2 = new _02_Ball("Red");
		
		System.out.println("원:");
		c1.findRadius();
		c1.findArea();

		System.out.println("\n공:");
		
		c2.findColor();
		c2.findVolume();
		c2.findRadius();
		c2.findArea();

	}

}
