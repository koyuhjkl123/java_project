package com.keduit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _16_SortTest {

	public static void main(String[] args) {
		
//		문자열 배열
		String[] fruits = {"사과", "바나나", "포도", "수박"};
		
//		문자열을 리스트 타입으로 변환
		List<String> list = Arrays.asList(fruits);
		
//		list 리스트 값, Collections.reverseOrder()반대 정렬/ 내림차순
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
//		내림차순 정렬였던 리스트 배열을 오름차순으로 변환됨
		Collections.reverse(list);
		System.out.println(list);
		

	}

}
