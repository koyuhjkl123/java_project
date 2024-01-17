package com.keduit;

public class _08_Interrupt1Test {

	public static void main(String[] args) {
		
		Runnable task = () ->{
			
			try {
				while (true) {
					System.out.println("task 실행...");
					Thread.sleep(1);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("정상종료");
		};
		
		
		Thread t = new Thread(task);
		t.start();
		
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t.interrupt();
	}

}
