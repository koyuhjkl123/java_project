package com.keduit;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class _12_TreeSetTest {

	public static void main(String[] args) {
		
		Set<String> set = Set.of("수박", "포도", "사과", "바나나", "키위");

//		HashSet : 많은 데이터가 있지만 중복 있을 시 사용
//		메서드 : first, last, lower, higher 은 없다.
		HashSet<String> hashset = new HashSet<String>(set);
		
		System.out.println(hashset);
		
//		이진트리 특징을 가진다.
		TreeSet<String> treeset = new TreeSet<String>(set);
		System.out.println(treeset);
		
//		treeset :  처음 인덱스 값
		System.out.println(treeset.first());
//		treeset : 마지막 인덱스 값
		System.out.println(treeset.last());
//		lower : 해당 "수박" 앞 인덱스 값
		System.out.println(treeset.lower("수박"));
//		higher : 해당 "수박" 뒤 인덱스 값
		System.out.println(treeset.higher("수박"));
		
	}

}
