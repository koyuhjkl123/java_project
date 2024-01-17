package com.keduits;

public class Exam05_TimeIsMoneyTest {

	public static void main(String[] args) throws InterruptedException {

		String sodan = "Time is money";
		Exam05_TimsIsMoney money1 = new Exam05_TimsIsMoney(sodan, "속담1");
		Exam05_TimsIsMoney money2 = new Exam05_TimsIsMoney(sodan, "속담2");

//		방법1
//		money1.start();
//		money1.join();
//		money2.start();
		
		
//		방법2
		money1.start();
		
		synchronized (money1) {
			
			try {
				money1.wait();
				money2.start();
			} catch (Exception e) {
			}
			
		}
		
		

		

		
		
		
		
	}

}
