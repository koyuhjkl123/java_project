package com.kediuts;

public class Exam06_MaxTest {

	public static void main(String[] args) {
		
		Exam06_Max<Number> n = new Exam06_Max<>();
		System.out.println(n.max(10.0, 8.0));
		System.out.println(n.max(5, 5.1));

		
		Exam06_Max<String> s = new Exam06_Max<>();
		System.out.println(s.max("Hello", "Hi"));
		System.out.println(s.max("Good", "moring"));

	}

}
