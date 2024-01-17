package com.keduit;

public class _17_waitNotifyTest {

	public static void main(String[] args) {
		
		TotalThread t = new TotalThread();
		
		t.start();
		
		synchronized (t) {
			
			System.out.println("대기중....");
			try {
				t.wait(); // 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("총합계 : " + t.total);

	}

}
