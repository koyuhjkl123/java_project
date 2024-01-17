package com.keduit;

public class Customer implements Runnable {

	private final Dish dish;
	
	public Customer(Dish dish) {
		this.dish = dish;
	}
	@Override
	public void run() {

		for(int i=0; i < 5; i++) {
			
			eat(i);
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void eat(int i) {
		synchronized (dish) {
			while(dish.isEmpty()) {
				try {
					dish.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println(i+"번째 음식을 먹습니다.");
			dish.setEmpty(true);
			dish.notify();
			
		}
	}

}
