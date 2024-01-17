package com.keduit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _33_Comparator1Test {

	public static void main(String[] args) {
		
//		리스트 형태인 list변수에 _22_car클래스에 있는 cars 변수를
//		0번지 ~ 2번지 가져오겠다
		List<_22_Car> list = _22_Car.cars.subList(0, 3);
		System.out.println(list);
		
//		_22_Car배열타입인 cars변수에 list변수라는 리스트형태를 배열로 변환[크기는 3개]
		_22_Car[] cars = list.toArray(new _22_Car[3]);
//		Arrays.toString : 사용하는 이유
//		배열 객체의 문자열 표현이 주소 값으로 나타나기 때문에 Arrays.toString를 사용한다.
		System.out.println(Arrays.toString(cars));
		
		
//		Comparator인터페이스 제네릭은 _22_Car이며, Comparator 정적 메소드인 comparing
//		를 통해 _22_Car 클래스에 참조되는 getModel 값을 반환하는데
//		그걸통해  값에 따라 정렬이 된다.
		Comparator<_22_Car> mc = Comparator.comparing(_22_Car::getModel);
//		cars라는 배열을 mc(Comparator) 변수 기준을 줘서 모델(getModel)값을 정렬한다.
		Arrays.sort(cars,mc);
		System.out.println(Arrays.toString(cars));

		Arrays.sort(cars, mc.reversed());
		System.out.println(Arrays.toString(cars));
		
		mc = Comparator.comparing(_22_Car::getMileage);
		
		Arrays.sort(cars,mc);
		System.out.println(Arrays.toString(cars));
//		cars라는 객체배열
//		Comparator.comparing(_22_Car::getMileage : 주행거리값의 기준
//		(a,b) -> b-a : 역순 정렬
		Arrays.sort(cars, Comparator.comparing(_22_Car::getMileage, (a,b)-> b-a));
		
		System.out.println(Arrays.toString(cars));
	}

}
