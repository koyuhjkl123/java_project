package com.keduit;

public class ChartypeUnicode3 {

	public static void main(String[] args) {
		
		int a,b;
		char c,d;
		
		
		a = 0xF90A;
		b = 0x50;
		
		System.out.println(a);
		System.out.printf("%c \n", a);
		
		c =(char) b;
		System.out.println((char)c);
		System.out.printf("%c \n", c);
		
		d = '#';
		System.out.printf("%c의 ACll값은 %d 입니다 \n", d, (int)d);
		System.out.println(d+"의 ACll값은 "+(int)d+" 입니다 \n");

	}

}
