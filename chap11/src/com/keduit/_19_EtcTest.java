package com.keduit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class _19_EtcTest {

	public static void main(String[] args) {
		
//		불변성을 가진 리스트
		List<String> list1 = List.of("사과", "포도", "수박", "사과", "키위", "포도",
				"망고", "사과");

		HashSet<String> hashset = new HashSet<String>(list1);
		List<String> list2 = new ArrayList<String>(hashset);
		System.out.println(list1);
		System.out.println(list2);
		
		Collections.sort(list2);
		
		for(String fruit: list2) {//                           빈도수
			System.out.printf("%s: %d%n", fruit, Collections.frequency(list1, fruit));
		}
	}

}
