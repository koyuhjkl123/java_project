package com.keduits;

public class Exam01_Runnable extends Thread{

	@Override
	public void run() {
		
		for(int i=0; i < 5; i++) {
			System.out.println("난 쓰레드의 작업");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	

}
