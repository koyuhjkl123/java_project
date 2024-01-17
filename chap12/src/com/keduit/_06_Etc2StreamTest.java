package com.keduit;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _06_Etc2StreamTest {

	public static void main(String[] args) {
		
		IntStream is1 = IntStream.iterate(1, x-> x+2);
		is1.limit(5).forEach(Util::Print);
		System.out.println();
		
		IntStream is2 = new Random().ints(0, 11); // 0 ~ 10까지 
		is2.limit(10).forEach(Util::Print);
		System.out.println();
		
		Stream<Double> ds = Stream.generate(Math::random); // 메서드 참조
		IntStream is3 = IntStream.range(1, 11);
		IntStream iS4 = IntStream.rangeClosed(1, 10);
		is3.limit(10).forEach(Util::Print);
		
		
		
		
		

	}

}
