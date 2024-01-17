package com.keduit;

public class _10_JoinTest {

	public static void main(String[] args) {
		
		JoinThread t = new JoinThread();
		
		t.start();
		
		
		try {
			t.join(); // 메인 쓰레드가 먼저 끝나지 않도록 t작업이 끝날때 까지 대기
			System.out.println("대기...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("총합 : " + t.total);

	}

}
