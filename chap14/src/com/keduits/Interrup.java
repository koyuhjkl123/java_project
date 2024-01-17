package com.keduits;

public class Interrup extends Thread {

	public int number =0;
	@Override
	public void run() {
		
		
		while(number != 1) {
			for(int i=0; i < 3; i++) {
				System.out.println("작업 실행 중...");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(number == 1) {
				System.out.println("작업 완료.");
			}
		}
		

	}

}
