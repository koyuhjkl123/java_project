package com.keduit;

public class _05_Thread5Test {

	public static void main(String[] args) {
		
		
		Thread t = new wrokerThread();

		t.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("난 메인");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
