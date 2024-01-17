package com.keduit;

import java.util.Arrays;
import java.util.Comparator;

public class _03_CompatorTest {

	public static void main(String[] args) {

		String[] strArrs = { "로마에 가면 로마법을 따르라", "시간은 금이다.", "펜은 칼보다 강하다." };

		Arrays.sort(strArrs, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
//				return o1.length() - o2.length(); // 오름차순
				return o2.length() - o1.length(); // 내림차순
			}

		});
		
		for(String s : strArrs) {
			System.out.println(s);
		}
	}
}
