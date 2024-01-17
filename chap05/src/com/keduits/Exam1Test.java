package com.keduits;

public class Exam1Test {

	public static void main(String[] args) {
		
		String s = "HeJllo Java";
		char c = 'J';
		
		
		System.out.println(countChar(s, c));

	}
	
	static int countChar(String s, char c) {
		
		int count = 0;
		
		for(int i=0; i < s.length(); i++) {
			if(s.charAt(i) == c) { // s 문자열에 인덱스(i)번호 를 추출 하여 char c 와 같은지 비교
				count++; // 같다면 1씩증가
			}
		}
		return count; // 카운팅된 count 변수를 반환
	}

}
