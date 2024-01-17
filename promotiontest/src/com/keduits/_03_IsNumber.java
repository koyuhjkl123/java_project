package com.keduits;

public class _03_IsNumber {
//	메서드명 : isNumber
//
//	기능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
//	모두 숫자로만 이루어져있으면 true를 반환하고, 그렇지 않으면 false를 반환한다.
//	만일 주어진 문자열이 null이거나 빈문자열 ""이라면 false를 반환한다.
//	반환타입 : boolean
//	매개변수 : String str - 검사할 문자열    

	static boolean isNumber(String str) {
		for(int i =0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;

	}
	
//	haracter.isDigit : 숫자인지 문자인지 확인 해주는 메소드
//	if(!Character.isDigit(ch)) : 문자가 하나라도 있으면 true
//	if(Character.isDigit(ch)) : 숫자가 하나라도 있으면 true

	public static void main(String[] args) {

		String str = "123";
		System.out.println(str + " 는 숫자입니까? " + isNumber(str));

		str = "1234o";
		System.out.println(str + " 는 숫자입니까? " + isNumber(str));

	}

}
