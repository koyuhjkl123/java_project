package com.keduit;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class _01_IteratorTest {

	public static void main(String[] args) {
		
		Collection<String> list = Arrays.asList("다람쥐", "고양이", "나비");
		
		
		Iterator<String> it = list.iterator();
//		hasNext : 각 인덱스에 값이 있으면 true, 없으면 false 
		while (it.hasNext()) {

			System.out.print(it.next() + "-");
		}
//		Iterator은 일회용이기 때문에 재사용 시 생성을 해애한다.
		while (it.hasNext()) {
			System.out.println(it.next() + "-");
			
		}
		
		it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "=");
			
		}

	}

}
