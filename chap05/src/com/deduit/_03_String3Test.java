package com.deduit;

public class _03_String3Test {

	public static void main(String[] args) {

		String s1 = new String("Hi,");
		String s2 = new String(" Java");

		System.out.println("문자열의 길이(s1) : " + s1.length());
		System.out.println(s1.charAt(1));

		s1 = s1.concat(s2);
		System.out.println(s1);
		System.out.println(s1.concat(s2) + "!");
		System.out.println(s1.toLowerCase() + "!");
		System.out.println(s1.toUpperCase() + "!");
		System.out.println(s1.substring(4,8));
		
		String s3 = " ";
		System.out.println(s3.isEmpty());
		System.out.println(s3.isBlank());

		String s4 = "";
		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());
		
		String s5 = "*-*";
		System.out.println(s5.repeat(15));
		
		System.out.println(s2.trim().indexOf("v"));
	}

}
