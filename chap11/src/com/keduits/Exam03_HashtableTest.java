package com.keduits;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Exam03_HashtableTest {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new Hashtable<>();

		map.put("김열공", 80);
		map.put("최고봉", 90);
		map.put("우등생", 95);
		map.put("나자바", 88);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String num1 = sc.next();


		boolean is = map.containsKey(num1);
		
		if(is) {
			System.out.println(map.get(num1));
		}else {
			System.out.println("존재하지 않는 이름입니다.");
		}
		
	}

}
