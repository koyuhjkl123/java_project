package com.keduit.pro;

public class Exam05_PhoneTest {

	public static void main(String[] args) {

		Exam05_Phone[] phones = { new Exam05_Phone("황진이"), new Exam05_Telephone("길동이", "내일"),
				new Exam05_SmartPhone("민국이", "갤러그") };


		for (Exam05_Phone g : phones) {
			if (g instanceof Exam05_SmartPhone) {
				((Exam05_SmartPhone) g).playGame();
			} else if (g instanceof Exam05_Telephone) {
				((Exam05_Telephone) g).autoAnswering();
			} else {
				g.talk();
			}
		}
		

	}

}
