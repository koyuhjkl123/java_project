package com.keduit;

public class FloatDouble {

	public static void main(String[] args) {
		
//		float var1 = 3.14; error
		float var1 = 3.14F; // 정상
		double var2 = 3.14;
		
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var4 : " + var4); // float : 8자리까지만 / 반올림
		System.out.println("var5 : " + var5); // double : 17자리까지만 / 반올림

		// e사용하기
		
		double var6 = 3e6;
		float var7 = 3e6f;
		double var8 = 2e-3;
		
		System.out.println("var 6 : " + var6);
		System.out.println("var 7 : " + var7);
		System.out.println("var 8 : " + var8);
		
		
		
	}

}
