package com.keduit;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class _31_Operator1Test {

	public static void main(String[] args) {

		IntUnaryOperator add2 = x -> x + 2;
		System.out.println(add2.applyAsInt(3));

		UnaryOperator<Integer> add22 = x -> x + 2;
		System.out.println(add22.apply(3));

		IntUnaryOperator mul2 = x -> x * 2;
//		andThen : 함수를 순차적으로 연결하여 두 함수를 연속적으로 실행하는 데 사용
		IntUnaryOperator add2mul2 = add2.andThen(mul2);

		System.out.printf("(3+2)*2 = ");
		System.out.println(add2mul2.applyAsInt(3));

		IntBinaryOperator add = (x, y) -> x + y;
		System.out.println(add.applyAsInt(10, 20));

		List<Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(10);
		list.add(3);
		list.replaceAll(add22);

		System.out.println(list);

	}

}
