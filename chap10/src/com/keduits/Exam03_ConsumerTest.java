package com.keduits;

import java.util.function.Consumer;

public class Exam03_ConsumerTest {

	public static void main(String[] args) {

		
		Consumer<Integer> c1 = x -> 
		System.out.println(x>=2?x+" apples":x+" apple");
		c1.accept(3);
		c1.accept(1);
		
		
		
		
	}

}
