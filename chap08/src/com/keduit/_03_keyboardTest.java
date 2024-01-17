package com.keduit;

public class _03_keyboardTest {

	public static void main(String[] args) {
		_01_Mouse m1 = new _01_Mouse("Logitech");
		_01_Mouse m2 = new _01_Mouse("Logitech");
		_01_Mouse m3 = m1;
		
		_02_keyboard k1 = new _02_keyboard("microsoft");
		_02_keyboard k2 = new _02_keyboard("microsoft");
		
		System.out.println(m1.toString());
		System.out.println(m1);
		
		System.out.println(k1.toString());
		System.out.println(k1);
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(k1.equals(k2));

	}

}
