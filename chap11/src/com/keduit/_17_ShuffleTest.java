package com.keduit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _17_ShuffleTest {

	public static void main(String[] args) {
		
		List<Character> list = new ArrayList<Character>();
		
		for(char c = 'A'; c<= 'G'; c++) {
//			System.out.println(c); // (A ~ G)
			list.add(c);
		}
		System.out.println(list);

//		3길이 만큼 이동?
		Collections.rotate(list, 3);
		System.out.println("간격 3 만큼 돌린 후 : " + list);
		
//		무작위 섞기
		Collections.shuffle(list);
		System.out.println("섞기 : " + list);
	}

}
