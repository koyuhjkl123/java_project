package com.keduit;

import java.util.function.IntBinaryOperator;

public class _11_CalculatorTest {

	public static void main(String[] args) {
		
//		IntBinaryOperator인터페이스
//		applyAsInt 추상 메소드
//		메소드는 int값으로 반환하는 메소드로 최적화된 메소드이다.
		IntBinaryOperator operator;
		
		// 정적메서드 참조
		operator = (x, y) -> _10_Calculator.staticMethod(x, y);
		System.out.println("결과1 : " + operator.applyAsInt(1, 2));

		
		operator = _10_Calculator :: staticMethod;
		System.out.println("결과2: " + operator.applyAsInt(3, 4));
		
		_10_Calculator calc = new _10_Calculator();
		operator = (x,y) -> calc.instanceMethod(x, y);
		System.out.println("결과3 : " + operator.applyAsInt(5, 6));
		
//		인스턴스메소드
		operator = calc :: instanceMethod;
		System.out.println("결과4: " + operator.applyAsInt(7, 8));
		
	}

}
