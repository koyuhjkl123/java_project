package com.keduits;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam01_runnalbeTest {

	public static void main(String[] args) {

		Exam01_Runnable run = new Exam01_Runnable();

        // 스레드를 직접 실행
        run.start();
		
		ExecutorService ex = Executors.newFixedThreadPool(5);
		
		ex.execute(() -> {
			for(int i=0; i < 5; i++) {
				System.out.println("난 쓰레드의 람다식 작업");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		
		for(int i =0; i < 5; i++) {
			System.out.println("난 메인...");
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ex.shutdown();
		
	}

}
