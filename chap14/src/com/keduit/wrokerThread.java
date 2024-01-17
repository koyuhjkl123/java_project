package com.keduit;

public class wrokerThread extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i< 5; i++) {
			System.out.println("workerThread.... 작업중");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
