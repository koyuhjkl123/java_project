package com.keduit;

import java.util.StringTokenizer;

public class _01_Uncheckde1test {

	public static void main(String[] args) {
		
//		실행 예외 : 개발자의 실수로 발생할 수 있으며, 예외 처리를 하지 않아도 컴파일할 수 있는 비검사형 예외이다.
//		일반 예외 : 예외 처리를 하지 않으면 컴파일 오류가 발생하므로 꼭 처리해야 하는 검사형 예외이다.
	
		String s = "Time is money";
		
		StringTokenizer st = new StringTokenizer(s);
		
		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken() + " + ");
		}
		System.out.print(st.nextToken() + " + ");

	}

}
