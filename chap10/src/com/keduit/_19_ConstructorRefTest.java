package com.keduit;

import java.util.Arrays;

public class _19_ConstructorRefTest {

	public static void main(String[] args) {

		_17_NewObject<String> s;
		
		_18_NewArray<Integer> i;
		
//		생성자를 호출
		s = x -> new String(x);
		
//		생성자 참조 (클래스명::new)
		s = String::new;
		
		System.out.println(s.getObject("홍길동"));
		
		i = x -> new Integer[x];
		// 배열 생성자 참조 (배열타입::new)
		i = Integer[]::new;
		
		Integer[] arr = i.getArray(5);
		
		for(int ss=0; ss <arr.length; ss++) {
			arr[ss] = 10 +(ss*10);
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
