package com.keduit;

import java.util.ArrayList;
import java.util.List;

public class _25_CarTest {

	public static void main(String[] args) {

		List<_22_Car> diselCars = findCars(_22_Car.cars, c -> !c.isGasoline());
		System.out.println("디젤 자동차 : " + diselCars);

		List<_22_Car> oldCars = findCars(_22_Car.cars, c -> c.getAge() > 10);
		System.out.println("10년 이상된 자동차 : " + oldCars);

		List<_22_Car> oldDiselCars = findCars(_22_Car.cars, c -> !c.isGasoline() && c.getAge() > 10);
		System.out.println("10년 이상된 디젤자동차 : " + oldDiselCars);
		
		printCars(diselCars, c -> System.out.printf("%s(%d)", c.getModel(), c.getAge()));
		
		printCars(oldCars, c -> System.out.printf("\n %s(%d, %d)", c.getModel(), c.getAge(), c.getMileage()));
	}

	private static void printCars(List<_22_Car> Cars, _24_CarConsumer cc) {
		for(_22_Car car: Cars) {
			cc.accept(car);
		}
	}

	public static List<_22_Car> findCars(List<_22_Car> cars, _23_CarPredicate cp) {
		List<_22_Car> result = new ArrayList<>();

		for (_22_Car car : cars) {
			if (cp.test(car)) {
//				System.out.println(car);
				result.add(car);
			}
		}
		return result;
	}

}
