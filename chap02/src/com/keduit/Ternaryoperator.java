package com.keduit;

public class Ternaryoperator {

	public static void main(String[] args) {

		int x = 1;

		int y;

		y = (x == 1) ? 10 : 20;
		System.out.println(y);
		
		
		
		y = (x > 1) ? x++ : x + 20;
		System.out.println(y);
		System.out.println(x);
		
		
		y = (x == 1) ? x++ : x + 20;
		System.out.println(y);
		System.out.println(x);
		
		
		int z;
		x = y = z = 3;
		
		z = x * y / z % 2;
		System.out.println(x+","+y+","+z);
		
		z = x++ + --y *x;
		System.out.println(z);
		
		x = 5;
		y = 10;
		z = ++x * y--;
		System.out.println(z);
		
		
		
		
	}

}
