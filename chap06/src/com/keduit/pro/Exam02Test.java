package com.keduit.pro;

public class Exam02Test {

	public static void main(String[] args) {
//		
//		Exam02 exam02 = new Exam02("길동진", 22);
//		Exam02 student = new Exam02_Student("황진이", 23, 100);
//		Exam02 foreogn = new Exam02_ForeognStudent("Amy", 30, 200, "U.S.A");
//		
		
		Exam02[] exam02 = new Exam02[3]; // 배열타입
		
		exam02[0] = new Exam02("길동진", 22);
		exam02[1] = new Exam02_Student("황진이", 23, 100);
		exam02[2] = new Exam02_ForeognStudent("Amy", 30, 200, "U.S.A");
		
		for(Exam02 g : exam02) {
			g.show();
			
		}

	}

}
