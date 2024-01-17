package com.keduits;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exam07_StringHashSet {

	public static void main(String[] args) {
		
		
		String[] s1 = {"a", "b", "a", "b", "c"};
		String[] s2 = {"c"};

		Set<String> m1 = new HashSet<String>(Arrays.asList(s1));
		Set<String> m2 = new HashSet<String>(Arrays.asList(s2));
		
//		HashSet 객체 생성 후 출력
		System.out.println("set1 : "+m1);
//		HashSet 객체 생성 후 출력
		System.out.println("set2 : " + m2);
//		객체가 동일한지 비교한 값
		System.out.println("set1과 set2는 같아 : " + m1.equals(m2));
//		m1이 m2의 모든 원소를 포함하면 true
		System.out.println("set1은 set2의 모든 원소를 포함한다. " + m1.containsAll(m2));
		
//		합집합
		m1.addAll(m2);
		System.out.println("합집합 : " + m1);
		
//		교집합
		m1.retainAll(m2);
		System.out.println("교집합 : "+m1);
	}
}
