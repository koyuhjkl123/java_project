package com.keduit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class _07_HashSetTest {

	public static void main(String[] args) {
		
//		Set 컬렉션
//		hashCode() 반환
		
//		문자열 배열 4개를 담은 fruits 변수
		String[] fruits = {"사과", "귤", "포도", "바나나"};
		
//		String타입의 객체에 대한 추가, 삭제, 검색 등 
		Set<String> h1 = new HashSet<String>();
		Set<String> h2 = new HashSet<String>();
		
		Set<String> h3 = new TreeSet<String>();
		
//		fruits 배열을 String s 변수에 각 한 원소씩 넣겠다.
//		h1에 한개씩 받은 s의 값을 추가 하겠다.
		for(String s: fruits) {
			h1.add(s); // String 타입인 s변수를 h1에 add하겠다
		}
//		Set<String> h1 = new HashSet<String>() 순서가 없다.
		System.out.println("h1 1단계 : " + h1);
		h1.add("바나나"); // 중복 허용이 되지 않음
		h1.remove("포도"); // "포도" 라는 배열을 삭제
		h1.add(null); // null 도 추가 가능
		
		System.out.println("h1 2단계 : " + h1);
		System.out.println(h1.size()); // 배열 크기를 정수로 알려줌
		System.out.println(h1.contains("수박")); // h1 배열에 "수박"이 있나 true, false
		
//		문자열 배열을 List타입으로 변경
		List<String> list = Arrays.asList(fruits);

//		list에 있는 모든 원소들을 h2에 담는다.
		h2.addAll(list);
		System.out.println("h2 1단계 : " + h2);
		
//		h3 변수는 TreeSet이며, 순서가 없지만
//		이진트리의 특징을 가져서 사전순으로 TreeSet은 정렬되어 나온다
		h3.addAll(list);
		System.out.println("h3 1단계 : "+h3);
		
//		모든 원소 삭제
		h2.clear();
//		isEmpty() : 비어 있으면 true 반환, 아니면 false 반환
		System.out.println(h2.isEmpty());
		
//		차례대로 순서있게 한개씩 값을 반환 Iterator을 사용한다.
		Iterator<String> it = h3.iterator();
		
//		문자열 배열이기 때문에 제네릭 타입은 String으로 한다.
		
//		hasNext : 다음 원소가 있는지 확인 여부
//		it.next() : 각 원소를 뽑느다.
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

}
