package com.keduits;

public class Accumulator extends Thread{
	String name;
	int sum;
	int sums;
	
	public Accumulator(String name, int sum) {
		this.name = name;
		this.sum = sum;
		
	}

	@Override
	public void run() {
		
		for(int i=1; i <= sum; i++) {
			int random = (int) (Math.random()*10);
			sums += random;
			
			System.out.println(Thread.currentThread().getName() + " : " + random);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public int getSums() {
		return sums;
	}
	
	

}
