package com.keduits;


public class Exam05_ControllerTest {

	public static void main(String[] args) {
		
		Exam05_Controller[] c = {
			new Exam05_Tv(false), // 생성자 power 인자 값에 false
			new Exam05_Radio(true)// 생성자 power 인자 값에 true
		};
		
		for(Exam05_Controller controller : c) {
			controller.show();
		}

	}

}
