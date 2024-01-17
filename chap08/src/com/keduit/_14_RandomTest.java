package com.keduit;

import java.util.Random;

public class _14_RandomTest {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		for(int i = 0; i <6; i++) {
			System.out.print(r.nextInt(48+1) + " ");
		}

	}

}
