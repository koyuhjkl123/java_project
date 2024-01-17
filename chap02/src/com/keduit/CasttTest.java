package com.keduit;

public class CasttTest {

	public static void main(String[] args) {
		
		int i;
		double d;
		byte b;
		
		i = 7 / 4;
		
		System.out.println(i);
		
		d = 7 / 4;
		System.out.println(d);
		
		d = 7 / (double) 4;
		System.out.println(d);
		
		
		i = 125;
		if(i< Byte.MIN_VALUE ||i > Byte.MAX_VALUE) {
			System.out.println("byte타입으로 변경안됨");
		}else {
			b = (byte)i;
			System.out.println(b);
		}
	}

}
