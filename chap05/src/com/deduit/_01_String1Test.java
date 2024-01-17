package com.deduit;

public class _01_String1Test {
	
	public static void main(String[] args) {
		
		
		
		String s1 = "Hi, Java!";
		String s2 = "Hi, Java!";
		
		String s3 = new String("Hi, Java!");
		String s4 = new String("Hi, Java!");
		
		
//		System.out.println("s1 == s2" + s1.hashCode());
//		System.out.println("s1 == s2" + s2.hashCode());
//		System.out.println("s1 == s2" + s3.hashCode());
//		System.out.println("s1 == s2" + s4.hashCode());
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		System.out.println("s1 == s2" + (s1 == s2));
		System.out.println("s1 == s3" + (s1 == s3));
		System.out.println("s3 == s4" + (s3 == s4));
		
		s1 =s3;
		System.out.println("s1 == s3" + (s1 == s3));
	}

}
