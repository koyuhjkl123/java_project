package com.keduit;

import java.util.HashSet;
import java.util.Set;

public class _11_MemberTest {

	public static void main(String[] args) {
		
		Set<_10_Member> m1 = new HashSet<_10_Member>();

		m1.add(new _10_Member("홍길동", 20));
		m1.add(new _10_Member("홍길동", 20));
		m1.add(new _10_Member("손오공", 20));
		m1.add(new _10_Member("손오공", 21));
		
		System.out.println(m1.size());
		System.out.println(m1);
	}

}
