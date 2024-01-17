package com.keduit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _06_ThreadPollTest {

	public static void main(String[] args) {
		
		Runnable task = () -> {
			
			for(int i=0; i < 10; i++) {
				System.out.println("난 쓰레드의 작업");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
//		ExecutorService exec = Executors.newCachedThreadPool();
//		exec.execute(task);
		
//		개수 제한 5
		ExecutorService ex1 = Executors.newFixedThreadPool(5);
		ex1.execute(task);
		
		for(int i=0; i < 10; i++) {
			System.out.println("난 메인...");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		ex1.shutdown(); // 종료
	}

}
