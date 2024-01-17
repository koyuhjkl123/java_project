package com.keduit;

public class _12_DameonTest {

	public static void main(String[] args) {
		
		Runnable r = () -> {
			
			for(int i=0; i < 3; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName());
			}
		};
		
		Thread t = new Thread(r, "작업쓰레드");
//		t.setDaemon(true);
		t.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("쓰레드 작업 종료");

	}

}
