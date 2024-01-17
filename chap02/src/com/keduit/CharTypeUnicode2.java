package com.keduit;

public class CharTypeUnicode2 {

	public static void main(String[] args) {
		
		char a, b, c, d, e;
		a = 'A';
		System.out.print(a + "\t");
		System.out.println((int)a);
		
		
		b = 'a';
		c = (char) (b +1);
		System.out.print(b + "\t");
		System.out.println(c);
		
		d= 90;
		System.out.println(""+ d);
		
		d = '가';
		e = (char) (d +1);
		
		System.out.printf("%d \t", (int) d);
		System.out.printf(" %c \n", e);

	}

}
