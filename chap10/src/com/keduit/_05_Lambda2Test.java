package com.keduit;

public class _05_Lambda2Test {

	public static void main(String[] args) {
		
		_06_Negative n;
		
//		람다식 : 선언부(매개변수) -> {실행문; 실행문...};
		n = (int x) -> { return -x;}; // -> 람다식 연산자
//		선언부의 타입은 추론이 가능하여 생략이 가능하다
		n = (x) -> {return -x;};
		
//		매개변수가 1개이면 () 생략이 가능함
		n = x -> {return -x;};
		
//		리턴이 있으면 중괄호 생략 불가..
		n = x -> {return -x;};
		
		
//		실행문이 하나이면 중괄호, return, 세미콜론  생략가능
		n = x -> -x;
		
		System.out.println(n.neg(100));

		_07_Printable p;
		
		p = () -> {System.out.println("안녕!");};
		
		p = () -> System.out.println("안녕 줄임");
		p.print();
		
		
		
		
	}

}
