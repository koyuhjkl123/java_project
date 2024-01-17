package com.keduit;

public class CompAssiginOp {

	public static void main(String[] args) {
		
		short num = 10;
		int rate = 3;
		
		
		num = (short)(num + 77L);
		rate = (int)(rate * 3.5);
		System.out.println(num);
		System.out.println(rate);
		
		
		num = 10;
		rate = 3;
		
		num += 77L;
		rate *= 3.5;
		System.out.println(num);
		System.out.println(rate);
		
		

	}

}
