package com.keduit;

public class _03_Thread3Test {

	public static void main(String[] args) {
		
		
		new Thread(()-> { // 람다식 형 쓰레드 사용
			for(int i=0; i < 5; i++) {
				System.out.println("쓰레드 람다형");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();;
		
		
		for(int i=0; i< 5; i++) {
			System.out.println("난 메인");
			try {
				Thread.sleep(500);//0.5초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
