package com.keduit;

public class CharBoolean {

	public static void main(String[] args) {
		
		char ga1 = '가';
		char ga2 = '\uac00';
		
		boolean cham = true;
		boolean geojit = false;
		
		System.out.println("gal : " + " " + ga1);
		System.out.println("(int)gal :  + " + (int)ga1);
		System.out.println("ga2 : " + " " + ga2);
		System.out.println("++ga2 : " + " " + ga2++); // ++전위형(증감연산자), 후위형++(증감연산자)
		System.out.println(cham + "가 아니면 " + geojit + "입니다");
		System.out.println("1"+"2");		
				

	}

}
