package com.keduits;

public class Exam07_FlyableTest {
	

	public static void main(String[] args) {
		
		Exam07_Flyable f = new Exam07_Flyable() {
			
			@Override
			public void speed() {
				System.out.println("속도");
				
			}
			
			@Override
			public void height() {
				System.out.println("높이");
			}
		};
		
		f.speed();
		f.height();

	}

}
