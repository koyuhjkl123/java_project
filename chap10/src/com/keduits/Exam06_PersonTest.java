package com.keduits;

import java.util.ArrayList;
import java.util.function.ToDoubleFunction;

public class Exam06_PersonTest {
	
	public static double average(ArrayList<Exam06_Person> person,ToDoubleFunction<Exam06_Person> s) {
//		매개 변수 2개 : 
//		ArrayList<Exam06_Person> person : 리스트 5개 값을 가져오기 위해
//		ToDoubleFunction<Exam06_Person> s : 평균을 구하기 위해 ToDoubleFunction 함수형 인터페이스 
//		누적 반환값
		double sum = 0.0;
		
		
		for(Exam06_Person pp: person) {
			sum += s.applyAsDouble(pp);
//			해당 객체의 값을 반환한다.
//			해당 객체의 값은 : main메서드에 있는 람다식으로 구현한 s.getAge();
//			s.getAge() : 45, 80 ,65 ,68 ,48 누적값
		}
//		총 더한 값 / size(5) 
		return sum / person.size();
	}

	public static void main(String[] args) {

		
		double p1 = average(Exam06_Person.persons, age-> age.getAge());
		double p2 = average(Exam06_Person.persons, key-> key.getKey());
		
		System.out.println("평균 신장 : " + p1);
		System.out.println("평균 체중 : " + p2);
	}

}
