package com.keduit;

public class BitOperater {

	public static void main(String[] args) {
		
		
		System.out.printf("%x\n", 0b0101 & 0b0011);
		System.out.printf("%x\n", 0b0101 | 0b0011);
		System.out.printf("%x\n", 0b0101 ^ 0b0011);
		System.out.printf("%x\n", (byte)~0b0011);
		System.out.printf("%x\n", 0b1010 >> 1); //	
		int i1 = -10;
		int i2 = i1 >> 1;
		int i3 = i1 >>> 1;
		
		System.out.printf("%x -> %d\n", i1, i1);
		System.out.printf("%x -> %d\n", i2, i2);
		System.out.printf("%x -> %d\n", i3, i3);
		
		
		
		
		
		
		
		
	}

}
