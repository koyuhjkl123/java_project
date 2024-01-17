package com.keduits;

public class Exam03_AccumulatorTest {

	public static void main(String[] args) {
		
		Exam03_Accumulator1 tor1 = new Exam03_Accumulator1(3);
		Exam03_Accumulator2 tor2 = new Exam03_Accumulator2(2);
				
		
		try {
			tor1.start();
			tor2.start();
			tor1.join();
			tor2.join();
			
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("누적의 값 : " +(tor1.getSums() + tor2.getSums()));
		

	}

}
