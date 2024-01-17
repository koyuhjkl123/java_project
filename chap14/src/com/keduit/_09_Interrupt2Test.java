package com.keduit;

public class _09_Interrupt2Test {

	public static void main(String[] args) {
		
		Runnable task = () ->{
			while (!Thread.currentThread().isInterrupted()) {
				System.out.println("task 실행중");
			}
			System.out.println("정상 종료");
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
