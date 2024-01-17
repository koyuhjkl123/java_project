package com.keduit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class _32_Operator2Test {

	public static void main(String[] args) {

		Comparator<Integer> comparator = (a, b) -> a - b;

//		comparator 정렬 기준 오름차순으로 정렬되어 maxBy는 최대값
		BinaryOperator<Integer> bo1 = BinaryOperator.maxBy(comparator);
		System.out.println(bo1.apply(10, 5));
		System.out.println(bo1.apply(10, 15));

//		comparator 정렬 기준 오름차순으로 정렬되어 maxBy는 최소값
		bo1 = BinaryOperator.minBy(comparator);

		System.out.println(bo1.apply(10, 5));
		System.out.println(bo1.apply(10, 15));

		List<_22_Car> newcars = remodeling(_22_Car.cars,
				c -> new _22_Car("뉴" + c.getModel(), c.isGasoline(), c.getAge(), c.getMileage()));
		
		System.out.println(newcars);
	}

//	UnaryOperator : 나의 입력 값을 받아들이고 동일한 타입의 값을 반환하는 함수 
//	단항 연산을 수행하는 함수형 인터페이스
//	입력과 출력이 동일한 타입의 연산을 정의하는 데 사용되며, 입력 값을 받아서 어떤 연산을 수행한 후 
//	동일한 타입의 값을 반환하는 함수를 표현할 때 사용
//	리스트나 배열의 각 요소를 변환하거나, 값을 변경하거나, 필터링하는 등의 작업을 처리할 때 유용하게 활용
	public static List<_22_Car> remodeling(List<_22_Car> cars, UnaryOperator<_22_Car> c) {

		List<_22_Car> result = new ArrayList<_22_Car>();

		for (_22_Car car : cars) {
			result.add(c.apply(car));
		}

		return result;
	}

}
