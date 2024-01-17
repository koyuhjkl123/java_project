package com.keduit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class _01_StreamTest {

	public static void main(String[] args) {

		
		List<Integer> list = new ArrayList<Integer>();
	
		Random r = new Random();
		
		for(int i=0; i < 10; i++) {
			list.add(r.nextInt(30));
		}
		System.out.println(list);
		
		List<Integer> gt10 = new ArrayList<Integer>();
		
		for(int i: list) {
			if(i > 10) {
				gt10.add(i);
			}
		}
		System.out.println(gt10);
		
		
		Collections.sort(gt10);
		for(int i: gt10) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		위의 과정을 stream으로 처리하자
//		stream 데이터가 흐른다는 느낌
		list.stream()
			.filter(i -> i > 10) // 필터 조건
			.sorted() // 정렬
			.forEach(x -> System.out.print(x + " ")); // 한개씩 출력한다.
		
		
		
		
	}

}
