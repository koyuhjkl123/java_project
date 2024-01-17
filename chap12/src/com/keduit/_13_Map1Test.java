package com.keduit;

import java.util.stream.Stream;

public class _13_Map1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String> s1 = Stream.of("a1", "b1", "b3", "b2", "c1");

		s1.map(String::toUpperCase).forEach(Util::Print);
		System.out.println();

		Stream<Integer> i1 = Stream.of(1, 2, 3, 1, 2, 4, 2);
		i1.map(i -> i * 2).forEach(Util::Print);
		System.out.println();
		
		Stream<String> s2 = Stream.of("a1", "a2", "a3");
		s2.map(x -> x.substring(1)).forEach(Util::Print);
		System.out.println();

		s1 = Stream.of("a1", "a2", "a3");
		s1.map(s-> s.substring(1)).mapToInt(Integer::parseInt).mapToObj(i->
		"b"+i).forEach(Util::Print);;
	}

}
