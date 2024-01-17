package com.keduit;

import java.util.ArrayList;
import java.util.LinkedList;

public class _05_PerformanceTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		LinkedList<Integer> a2 = new LinkedList<Integer>();
		
		long start = System.nanoTime();
		
		for(int i=0; i < 100000; i++) {
			a1.add(0,i);
		}
		
		long end = System.nanoTime();
		System.out.println("ArrayList로 처리한 시간: " + (end - start));
		
		start = System.nanoTime();
		
		for(int i=0; i < 100000; i++) {
			a2.addFirst(i);
		}
		end = System.nanoTime();
		
		System.out.println("Linked로 처리한 시간 : " + (end - start));
		

	}

}
