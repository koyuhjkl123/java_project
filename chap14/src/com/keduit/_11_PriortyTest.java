package com.keduit;


public class _11_PriortyTest {

	public static void main(String[] args) {
		

		Counter c1 = new Counter("느긋한");
		
		c1.setPriority(Thread.MIN_PRIORITY);
		Counter c2 = new Counter("급한");
		c2.setPriority(Thread.MAX_PRIORITY);
		
		c1.start();
		c2.start();
		
	}

}
