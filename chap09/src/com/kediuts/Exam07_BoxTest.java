package com.kediuts;

public class Exam07_BoxTest {

	public static void main(String[] args) {
		
		Exam07_Box<Integer> i = new Exam07_Box<>();
		i.setBox(new Integer(100));
		System.out.println(i.getBox());
		
		Exam07_Box<String> s = new Exam07_Box<>();
		s.setBox("만능이네!");
		System.out.println(s.getBox());

	}

}
