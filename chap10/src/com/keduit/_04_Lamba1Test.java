package com.keduit;

import java.util.Arrays;

public class _04_Lamba1Test {

	public static void main(String[] args) {
		
		String[] strArr = { "로마에 가면 로마법을 따르라, ", "시간은 금이다.",
				"펜은 칼보다 강하다"};
		
		Arrays.sort(strArr, (s1, s2) -> s1.length() - s2.length());
		
		for(String s : strArr) {
			System.out.println(s);
		}
		}

	}


