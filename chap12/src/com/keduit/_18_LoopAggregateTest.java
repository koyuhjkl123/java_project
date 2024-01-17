package com.keduit;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _18_LoopAggregateTest {

	public static void main(String[] args) {
		
		Stream<Nation> s1 = Nation.nations.stream()
				.peek(Util::printWithParenthesis);
		
		System.out.println("어디에 나타날까요");
		Optional<Nation> on = s1.max(
				Comparator.comparing(Nation::getPopulation));
		
		System.out.println();
		System.out.println(on.get());

		s1 = Nation.nations.stream();
		
		System.out.println(s1.count());
		
		System.out.println(IntStream.of(5,6,3,1).min());
		System.out.println(IntStream.of(5,6,3,1).min().getAsInt());
	}

}
