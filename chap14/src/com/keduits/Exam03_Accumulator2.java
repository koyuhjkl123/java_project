package com.keduits;

public class Exam03_Accumulator2 extends Thread{

		public int number;
		private int sum;
		private int sums;
		private String name;
		
		public Exam03_Accumulator2(int number) {
			this.number = number;
		}
		@Override
		public void run() {
			
			
			for(int i=0; i < number; i++) {
				sum = (int) (Math.random()*10);
				sums += sum;
				System.out.println("Thread-1 : " + sum);
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		public int getSums() {
			return sums;
		}
}
