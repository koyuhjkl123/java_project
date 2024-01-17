package com.keduit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _09_StudentStreamTest {

	public static void main(String[] args) {

		List<Student> list = Arrays.asList(
				new Student("홍길동", 90), 
				new Student("김길동", 95), 
				new Student("박길동", 75));

		
		Stream<Student> stream = list.stream();
		stream.forEach(s-> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" +score);
		});
		
	stream = list.stream();
	
	double avg = stream.mapToInt(Student::getScore)
			.average() // 평균
			.getAsDouble();
	System.out.println("평균 점수 : " + avg);
		
//		stream은 1회용이다. 재활용 할려면 재선언
//		stream = list.stream();
//		stream.forEach(s -> {
//			String name = s.getName();
//			int score = s.getScore();
//			System.out.println(name + "-" +score);
//		});
		
	}

}
