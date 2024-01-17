package com.keduit;

public class _10_WrapperTest {

	public static void main(String[] args) {
		
		Integer bil = new Integer(10);
		
		int li = bil.intValue(); // int타입으로 반환한다.
		
		Integer bi2 = 10;// 자동 박싱
		int i2 = bi2; // 자동 언박싱
		int i3 = bi2 + 20; // 자동 언박싱
		
		String s1 = Double.toString(3.14);
		Double pi = Double.parseDouble("3.14");// 해당 문자열을 실수값으로 변경
		Integer bi3 = Integer.valueOf("11", 16);
		System.out.println(bi3);

	}

}
