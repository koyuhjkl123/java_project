package com.keduit;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _22_Collect2Test {

	public static void main(String[] args) {

		Stream<Nation> sn = Nation.nations.stream();
		Stream<String> ss = sn.map(Nation::getName).limit(3);
		List<String> list = ss.collect(Collectors.toList());
		System.out.println(list);

		sn = Nation.nations.stream();

		Set<String> es = sn.map(Nation::getName).limit(4).collect(Collectors.toSet());

		System.out.println(es);

		sn = Nation.nations.stream();
		Map<String, Double> map = sn.filter(Nation::isIsland)
				.collect(Collectors.toMap(Nation::getName, Nation::getPopulation));
		System.out.println(map);

		sn = Nation.nations.stream();
		Set<Nation> hashSet = sn.filter(Predicate.not(Nation::isIsland))
				.collect(Collectors.toCollection(HashSet<Nation>::new));
		
		hashSet.forEach(x-> Util.Print("("+x.getName()+","+x.getGdpRank()+")"));
	}

}
