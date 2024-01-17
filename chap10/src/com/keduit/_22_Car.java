package com.keduit;

import java.util.Arrays;
import java.util.List;

public class _22_Car {

	private String model;
	private boolean gasoline;
	private int age;
	private int mileage;

	public _22_Car(String model, boolean gasoline, int age, int mileage) {
		this.model = model;
		this.gasoline = gasoline;
		this.age = age;
		this.mileage = mileage;
	}

	public String getModel() {
		return model;
	}

	public int getAge() {
		return age;
	}

	public int getMileage() {
		return mileage;
	}

	public boolean isGasoline() {
		return gasoline;
	}

	@Override
	public String toString() {
		return "_22_Car [model=" + model + ", gasoline=" + gasoline + 
				", age=" + age + ", mileage=" + mileage + "]";
	}

//	_22_Car 객체의 배열을 리스트 형태인 _22_Car 형태
//	리스트 형태는 크기가 고정값을 가진다.
	public static final List<_22_Car> cars = Arrays.asList(new _22_Car("소나타", true, 18, 210000),
			new _22_Car("코란도", false, 15, 200000), new _22_Car("그랜저", true, 12, 150000),
			new _22_Car("싼타페", false, 10, 220000), new _22_Car("아반테", true, 10, 70000),
			new _22_Car("에쿠우스", true, 6, 100000), new _22_Car("그랜저", true, 5, 80000),
			new _22_Car("소나타", true, 2, 350000), new _22_Car("쏘렌토", false, 1, 10000),
			new _22_Car("아반테", true, 1, 70000));
}
