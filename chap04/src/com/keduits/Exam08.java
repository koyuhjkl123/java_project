package com.keduits;

import java.util.Random;

public class Exam08 {

	private int face;

	public int roll() {
		Random random = new Random();
		face = (int) (Math.random() * 6) + 1;

		return face;

	}
	
	
}
