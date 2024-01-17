package com.keduit;

public class _15_BoxTest {

	public static void main(String[] args) {
		
		_12_Box abox = new _12_Box();
		_12_Box obox = new _12_Box();
		
		abox.setOb("apple");
		obox.setOb("orange");

		
		System.out.println(abox.getOb());
		System.out.println(obox.getOb());
	}

}
