package com.keduit;

public class _06_StringBuilderTest {

	public static void main(String[] args) {

		String s = new String("hi");
		// jvm이 생성한 객체의 고유 주소를 int 변환하여 반환
		System.out.println(s.hashCode());
		s = s + "!";
		String s1 = "hi";
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		StringBuilder sb = new StringBuilder("hi");
		System.out.println(sb.hashCode());
		sb = sb.append("!");
		System.out.println(sb.hashCode());
		
		System.out.println(sb);
//		replace : 0번째 부터 1번째 까지 Good Bye으로 변경해줘, --> Good Bye! 
//		insert : "java, " --> java, Good Bye!
		System.out.println(sb.replace(0, 2, "Good Bye").insert(0, "java, "));
		System.out.println(sb.hashCode());
		
	}

}
