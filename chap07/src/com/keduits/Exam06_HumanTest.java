package com.keduits;

public class Exam06_HumanTest {
	
	public static void main(String[] args) {
		
		
		Exam06_Human.echo();
		
		Exam06_Student s = new Exam06_Student(20);
		s.print();
		s.eat();
		
		
		Exam06_Human p = new Exam06_worker();
		p.print();
		p.eat();

	}

}
