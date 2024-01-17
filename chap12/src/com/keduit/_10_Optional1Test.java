package com.keduit;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class _10_Optional1Test {
	public static OptionalDouble divide(double x, double y) {
//		OptionalDouble : double 값이 있는지 아닌지 나타내는 컨테이너 클래스
		return y == 0? OptionalDouble.empty():OptionalDouble.of(x / y);
	}

	public static void main(String[] args) {

		OptionalInt i = OptionalInt.of(100);
		OptionalDouble d = OptionalDouble.of(3.14);
		Optional<String> s = Optional.of("홍길동");
		
		System.out.println(i.getAsInt());
		System.out.println(d.getAsDouble());
		System.out.println(s.get());
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
		
		
		System.out.println(divide(1.0, 2.0));
		System.out.println(divide(0.0, 5.0));
	}

}
