package com.keduit;

import java.util.Arrays;
import java.util.List;

public class _25_StudentReduceTest {

	public static void main(String[] args) {
		
		List<Student> st = Arrays.asList(
				new Student("홍길동", 92),
				new Student("김길동", 80),
				new Student("강길동", 75),
				new Student("최길동", 90),
				new Student("박길동", 89),
				new Student("이길동", 70)
				);
		
		int sum1 = st.stream().mapToInt(Student::getScore).sum();
		System.out.println(sum1);
		
		sum1 = st.stream().map(Student::getScore).reduce(0, (a, b)-> a+b);
		System.out.println(sum1);
		
		sum1 = st.stream().map(Student::getScore).reduce((a,b) -> a+b).get();
		System.out.println(sum1);

	}

}
