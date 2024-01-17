package com.keduit;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _17_MatchTest {

	public static void main(String[] args) {

		Stream<String> s1 = Stream.of("a1", "b2", "c3");

//		startsWith : c로 시작하는 원소가 있는 지 조사(최종 연산)
		boolean b1 = s1.anyMatch(s -> s.startsWith("c"));
		System.out.println(b1);

//		allMatch : p가 3으로 모두 떨어지면 true, 아니면 false
		b1 = IntStream.of(10, 20, 30).allMatch(p -> p % 3 == 0);
		System.out.println(b1);
		
//		noneMatch : p가 3인 숫자 없으면 true, 있으면 false
		b1 = IntStream.of(1, 2, 3).noneMatch(p -> p == 3);
		System.out.println(b1);
		
		if(Nation.nations.stream().allMatch(n -> n.getPopulation() > 100.0)) {
			System.out.println("모든 국가의 인구가 1억이 넘는다.");
		}else {
			System.out.println("모든 국가의 인구가 1억이 넘지 않는다.");
		}
		
		Optional<Nation> nation =  Nation.nations.stream().findFirst();
		
		nation.ifPresentOrElse(Util::Print, ()-> System.out.println("없음"));
		
		nation = Nation.nations.stream().filter(Nation::isIsland).findAny();
		
		nation.ifPresent(Util::Print);
		
		
		
		
		
		
	}

}
