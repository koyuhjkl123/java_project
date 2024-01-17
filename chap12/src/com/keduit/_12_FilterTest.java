package com.keduit;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _12_FilterTest {

	public static void main(String[] args) {
		
		Stream<String> s1 = Stream.of("a1", "b2", "b3", "c1", "c2", "c3");
		
//		s1.filter(s-> s.startsWith("c"))
//		.skip(1)
//		.forEach(Util::Print);
		
		Stream<String> s2 = s1.filter(s-> s.startsWith("b"));
		Stream<String> s3 = s2.skip(1);
		s3.forEach(Util::Print);
		
		IntStream i1 = IntStream.of(10, 20, 30, 10, 20,30,40);
		IntStream i2 = i1.filter(i -> i % 2 == 0);
		IntStream i3 = i2.distinct(); // 중복 제거
		System.out.println();
		i3.forEach(Util::Print);
		
		System.out.println("\n인구가 1억 이상인 국가 2개만 ");
		
		Stream<Nation> n1 = Nation.nations.stream();
		Stream<Nation> n2 = n1.filter(n -> n.getPopulation() > 100.0);
		
		Stream<Nation> n3 = n2.limit(2); // 2개만 가져온다.
		n3.forEach(Util::printWithParenthesis);
		
		
		Stream<Nation> n = Nation.nations.stream();
		n.filter(x -> x.getPopulation() > 100.0)
		.limit(2).forEach(Util::printWithParenthesis);
		
		
		
		
	}

}
