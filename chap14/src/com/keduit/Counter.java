package com.keduit;

public class Counter extends Thread{

	
	private int count = 0;
	
	public Counter(String name) {
		setName(name);
	}

	@Override
	public void run() {
		while(count++ < 5) {
			System.out.println(getName() + "->");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}
