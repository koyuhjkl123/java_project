package com.keduit;

import java.util.stream.Stream;

public class _14_Map2Test {

	public static void main(String[] args) {
		
		
		
		Stream<Nation> n = Nation.nations.stream();
		
//		국가이름 4개 출력
		n.map(Nation::getName).limit(4).forEach(Util::printWithParenthesis);
		
		n = Nation.nations.stream();
		
		n.mapToInt(Nation::getGdpRank).forEach(Util::Print);;

	}

}
