package com.keduit;

public class TotalThread extends Thread{
	
	int total;
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i<=100; i++) {
				total += i;
			}
			
			notify(); // 통보
		}
	}

}
