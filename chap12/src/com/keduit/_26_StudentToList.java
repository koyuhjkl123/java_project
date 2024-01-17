package com.keduit;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _26_StudentToList {

	public static void main(String[] args) {

		List<Student> st = Arrays.asList(
				new Student("홍길동", 92, Student.Sex.MALE, Student.City.SEOUL),
				new Student("김길동", 80, Student.Sex.FEMALE, Student.City.BUSON), 
				new Student("강길동", 75, Student.Sex.MALE, Student.City.SEOUL),
				new Student("최길동", 90, Student.Sex.FEMALE, Student.City.SEOUL),
				new Student("박길동", 89, Student.Sex.MALE, Student.City.BUSON),
				new Student("이길동", 70, Student.Sex.MALE, Student.City.BUSON));

		List<Student> maleList = st.stream().filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(Collectors.toList());
		System.out.println(maleList);
		
		maleList.stream().forEach(Util::Print);
		System.out.println();
		
		maleList = st.stream().filter(s-> s.getSex() == Student.Sex.FEMALE).collect(
				Collectors.toList());
		System.out.println(maleList);

		Map<Student.Sex, List<Student>> m1 = st.stream().collect
				(Collectors.groupingBy(Student::getSex));
		System.out.print("남학생 : ");
		
		
		m1.get(Student.Sex.MALE).stream().forEach(s-> System.out.print(s.getName()+" "));
		System.out.println();
		System.out.print("여학생 : ");
		m1.get(Student.Sex.FEMALE).stream().forEach(s-> System.out.print(s.getName() + " "));
		
		Map<Student.City, List<String>> m2 = st.stream().collect(Collectors.
				groupingBy(Student::getCity, Collectors.mapping(
						Student::getName, Collectors.toList())));
		System.out.print("\n 서울 : ");
		m2.get(Student.City.SEOUL).stream().forEach(s-> System.out.print(s + " "));
		
		System.out.print("\n 부산 : ");
		m2.get(Student.City.BUSON).stream().forEach(s-> System.out.print(s + " "));
		
		Map<Student.Sex, Double> m3 = st.stream().collect(Collectors.groupingBy(
				Student::getSex, Collectors.averagingDouble(Student::getScore)));
		System.out.print("\n남학생 평균 점수 : " + m3.get(Student.Sex.MALE));
		System.out.println("\n여학생 평균 점수 : " + m3.get(Student.Sex.FEMALE));
		
		Map<Student.Sex, String> m4 = st.stream().collect(Collectors.groupingBy(
				Student::getSex, Collectors.mapping(Student::getName,
						Collectors.joining(","))));
		System.out.println("남학생 명단 : " + m4.get(Student.Sex.MALE));
		System.out.println("여학생 명단 : " + m4.get(Student.Sex.FEMALE));
	}

}
