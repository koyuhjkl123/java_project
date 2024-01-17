package com.keduit;

public class _07_StopTest {

	public static void main(String[] args) {
		
		
		StopThread t = new StopThread();
		
		t.start(); // 쓰레드 실행
		
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t.stop = true;

	}

}
