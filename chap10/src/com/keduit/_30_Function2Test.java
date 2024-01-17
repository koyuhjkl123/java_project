package com.keduit;

import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class _30_Function2Test {

	public static void main(String[] args) {
		
		
//		_22_Car 객체에서 String 타입의 모델 이름만 반환하는 Function 객체
		Function<_22_Car, String> f1 = c-> c.getModel();
//		_22_Car 객체에 int 타입의 연식만 반환하는 ToIntFunction 객체
		ToIntFunction<_22_Car> f2 = c-> c.getAge();
		
		for(_22_Car car : _22_Car.cars) {
			System.out.println("(" + f1.apply(car) + ", " + f2.applyAsInt(car)
			+ ")");
			
		}
		System.out.println();
		
//		_22_Car 객체를 이용해서 int타입의 연식을 반환하는 람다식이며, ToIntFunction<_22_Car>
//		타입에 맞는 람다식
		double averageAge = average(_22_Car.cars, c-> c.getAge());
		double averageMileage = average(_22_Car.cars, c-> c.getMileage());
		
		System.out.println("평균 연식 : " + averageAge);
		System.out.println("평균 주행거리 : " + averageMileage);

	}
	
//	_22_Car 객체를 사용해서 int타입을 반환하는 인터페이스 타입
	public static double average(List<_22_Car> cars, ToIntFunction<_22_Car> f) {
		double sum = 0.0;
		
		for(_22_Car car : cars) {
			sum += f.applyAsInt(car);
		}
		return sum / cars.size();
		
	}

}
