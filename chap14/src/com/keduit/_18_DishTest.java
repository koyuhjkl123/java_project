package com.keduit;

public class _18_DishTest {

	public static void main(String[] args) {
		
		final Dish d = new Dish();
		
		new Thread(new Customer(d)).start();
		new Thread(new Cook(d)).start();
	}

}
