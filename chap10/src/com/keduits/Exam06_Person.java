package com.keduits;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam06_Person {
	
	String name; // 이름
	double key; // 키
	double age; // 체중
	
	public Exam06_Person(String name, double key, double age) {
		this.name = name;
		this.key = key;
		this.age =age;
	}
	public String getName() {
		return name;
	}
	
	public double getKey() {
		return key;
	}
	
	public double getAge() {
		return age;
	}
	
//	Person 객체를 포함하는 5명 타입의 persons가 있다.
	static final ArrayList<Exam06_Person> persons = new ArrayList<>(
			Arrays.asList(
			new Exam06_Person("황진이", 160, 45),
			new Exam06_Person("이순신", 180, 80),
			new Exam06_Person("김삿갓", 175, 65),
			new Exam06_Person("홍길동", 170, 68),
			new Exam06_Person("배장화", 155, 48)
			));

}
