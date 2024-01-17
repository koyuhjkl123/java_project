package com.keduit;

public class _09_GarbageTest {

	public static void main(String[] args) {
		
		for(int i=0; i <3; i++) {
			new _08_Garbage(i);
		}
		System.gc();

	}

}
