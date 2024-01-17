package com.keduit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _18_SearchTest {

	public static void main(String[] args) {

		
		String[] s = {"황금을", "돌", "같이", "보라"};
		
		List<String> list = Arrays.asList(s);
		
//		사전순 정렬
		Collections.sort(list);
		System.out.println(list);
		
		int i = Collections.binarySearch(list, "황금을");
		System.out.println(i);
 	}

}
