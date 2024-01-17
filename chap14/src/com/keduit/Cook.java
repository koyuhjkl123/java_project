package com.keduit;

public class Cook implements Runnable {

	private final Dish dish;
	
	public Cook(Dish dish) {
		this.dish = dish;
	}
	@Override
	public void run() {
		
		for(int i =0; i < 5; i++) {
			
			cook(i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	private void cook(int i) {
		
		synchronized (dish) {
			while(!dish.isEmpty()) {
				try {
					dish.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(i+"번째 음식이 준비되었습니다.");
			dish.setEmpty(false);
			dish.notify();
		}
		
	}

}
