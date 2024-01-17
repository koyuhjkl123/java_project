package com.keduit;

public class StopThread extends Thread{

	public boolean stop;

	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행");
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("stop종료");
	}
	
	
	
	
}
