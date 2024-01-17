package com.keduit;

import java.util.stream.IntStream;

public class _08_ParallelTest {

	public static void main(String[] args) {
		
		
		long start;
		long end;
		
		IntStream is = IntStream.rangeClosed(1, 100000000);
		start = System.currentTimeMillis();
		
		long total = is.sum();
		
		end = System.currentTimeMillis();
		System.out.println("순차처리 : " + (end-start));
		is = IntStream.rangeClosed(1, 100000000).parallel();
		start = System.currentTimeMillis();
		
		total = is.sum();
		end = System.currentTimeMillis();
		System.out.println("병렬 처리 : " + (end-start));
		

	}

}
