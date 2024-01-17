package com.keduit;

public class _04_Thread4Test {

	public static void main(String[] args) {
		
		Runnable t = ()-> {
			for(int i=0; i < 5; i++) {
				System.out.println("쓰레드");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		
		for(int i=0; i<5; i++) {
			System.out.println("난 메인...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
