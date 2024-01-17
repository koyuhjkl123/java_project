package com.keduits;

import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Exam04_FunctionTest {



	public static void main(String[] args) {

		
		
		ToIntFunction<String> mss = c -> c.length();
		System.out.println("ToIntFunction : ");
		System.out.println("length(10) = "+mss.applyAsInt("10"));
		System.out.println("length(100) = "+mss.applyAsInt("100"));
		System.out.println("length(1000) = "+mss.applyAsInt("1000"));
		
		System.out.println();
		
		UnaryOperator<Integer> ms = x-> Integer.toString(x).length();
		System.out.println("UnaryOperator : ");
		System.out.println("length(10) = "+ms.apply(10));
		System.out.println("length(100) = "+ms.apply(100));
		System.out.println("length(1000) = "+ms.apply(1000));
		
	}
	
	static Integer length(int s) {
		
		String ss = Integer.toString(s);
		
		
		return ss.length();
	}

}
