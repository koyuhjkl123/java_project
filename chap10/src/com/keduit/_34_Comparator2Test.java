package com.keduit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _34_Comparator2Test {

	public static void main(String[] args) {
		
		List<_22_Car> list = _22_Car.cars.subList(5, 8);
		
		System.out.println(list);

//		list라는 리스트를 배열로 변경하면서 4개의 공간
		_22_Car[] cars = list.toArray(new _22_Car[4]);
		
		System.out.println(Arrays.toString(cars));

		Comparator<_22_Car> mc = Comparator.comparing(_22_Car::getModel);
		
//		Arrays.sort : cars 배열, mc : 기준
//		Arrays.sort(cars, mc);
//		NullPointerException 오류 / Null값이 있어서 나온다.
//		System.out.println(Arrays.toString(cars));
		
//		Comparator.nullsFirst(mc) : getModel라는 정렬된 값 중에 null이라는 값을 앞으로 보내줘
		Comparator<_22_Car> mcn = Comparator.nullsFirst(mc);
		
		Arrays.sort(cars, mcn);
		System.out.println(Arrays.toString(cars));
		
//		기존 값을 없애고 값을 변경된다.
		list.set(1, new _22_Car("에쿠우스", false, 10, 31000));
		System.out.println(list);
		
//		3개의 공간을 가진 배열을 cars에게 대입
		cars = list.toArray(new _22_Car[3]);
		System.out.println(cars);
		System.out.println(Arrays.toString(cars));
		
		Comparator<_22_Car> mac = mc.thenComparing(_22_Car::getAge);
		
		
		Arrays.sort(cars,mac);
		System.out.println(Arrays.toString(cars));
		
		
		
		
		
		
		
		
		
		
		
	}

}
