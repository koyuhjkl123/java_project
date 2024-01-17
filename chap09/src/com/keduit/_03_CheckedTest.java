package com.keduit;

public class _03_CheckedTest {

	public static void main(String[] args){
		
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
				e.toString();
				e.getMessage();
			}
		

	}

}
