package com.keduit;

public class _08DoWhile {

	public static void main(String[] args) {
		
		int s = 62;
		
		do {
			s++;
		}while(s < 5);
		System.out.println(s);
		
		s = 68;
		while(s < 5) {
			s++;
		}
		System.out.println(s);
		
		int a = 2;
		int b = 1;
		
		
		while(a <= 9) {
			System.out.printf("---------------------");
			System.out.printf("%4d단",a);
			System.out.printf("\t-----------------");
			System.out.println();
			do {
				System.out.printf("%4d|", a*b);
				b++;
			}while(b <= 9);
			b = 1;
			a++;
			System.out.println();
		}
	}
}
