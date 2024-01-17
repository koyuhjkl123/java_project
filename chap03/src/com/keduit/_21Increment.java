package com.keduit;

public class _21Increment {
	
	static void increment(int x) {
		System.out.println("----"+x);
		x++;
		System.out.println("----" + x);
	}

	public static void main(String[] args) {

		int x = 0;
		System.out.println(x);
		increment(x);
		System.out.println("xx"+x);
		
	}

}
