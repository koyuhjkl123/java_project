package com.keduits;

import java.util.HashSet;
import java.util.Set;

public class Exam02_PersonTest {

	public static void main(String[] args) {
		
		

		Set<Exam02_Person> set = new HashSet<Exam02_Person>();
		
		set.add(new Exam02_Person("김열공", 20));
		set.add(new Exam02_Person("우등생", 16));
		set.add(new Exam02_Person("최고봉", 56));
		set.add(new Exam02_Person("나자바", 35));
		
		 
		
		set.forEach(person -> System.out.println(person));
		
		System.out.println(set.toString());

	}

}
