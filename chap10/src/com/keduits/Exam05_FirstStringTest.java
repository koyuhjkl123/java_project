package com.keduits;

import java.util.function.UnaryOperator;

class FirstString{
	String startsWith(String s) {
		return Character.toString(s.charAt(0));
	}
}
public class Exam05_FirstStringTest {
	
	

	public static void main(String[] args) {
//		생성자 호출
		FirstString mp = new FirstString();
		
		UnaryOperator<String> scv = c-> mp.startsWith(c);
		
//		메서드 참조를 이용
		UnaryOperator<String> scv1 = mp::startsWith;
		
//		apply 메서드에 값
		System.out.println(scv1.apply("asdasfda"));
	}

}
