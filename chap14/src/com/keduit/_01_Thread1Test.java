package com.keduit;

public class _01_Thread1Test {

	public static void main(String[] args) {
		
		Thread t = new Thread(new MyRunnable());
		
//		스래드를 띄운다?
		t.start();
		
		for(int i=0; i <5; i++) {
			System.out.println("안녕.");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		

	}

}
