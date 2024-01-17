package com.keduit;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class _26_PridicateTest {

	public static void main(String[] args) {

//		IntPredicate : true, false 구현체
		IntPredicate even = x -> x % 2 == 0; // true, false
//		IntPredicate test(10) 2로 10를 나눈 나머지 값이 0이면 true
//		test메소드 해당 값이 boolean 반환
		System.out.println(even.test(10) ? "짝수" : "홀수");
		

//		x == 1이면 true
		IntPredicate one = x -> x == 1;

//		one.or(even) : one.or(even) 2로 나눈 나머지 값이 0이거나 x가 1이면 true
		IntPredicate oneOrEven = one.or(even);
		System.out.println(oneOrEven.test(5)? "1혹은 짝수": "1아닌 홀수");
		
		
		Predicate<String> p = Predicate.isEqual("Java Lambda");
		System.out.println(p.test("Java Lambda"));
		System.out.println(p.test("Java lambda"));
		
		BiPredicate<Integer, Integer> bp = (x,y) -> x>y;
		System.out.println(bp.test(2, 3));
	}

}
