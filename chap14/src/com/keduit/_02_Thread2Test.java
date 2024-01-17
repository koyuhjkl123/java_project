package com.keduit;

public class _02_Thread2Test {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				
				for(int i=0; i<5; i++) {
					System.out.println("쓰레드동작!");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();

		for(int i=0; i < 5; i++) {
			System.out.println("난 메인...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
