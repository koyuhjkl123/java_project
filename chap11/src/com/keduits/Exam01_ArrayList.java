package com.keduits;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Exam01_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("갈매기");
		list.add("나비");
		list.add("다람쥐");
		list.add("라마");
		
		Predicate<String> booleans = x -> x.length() == 2;
		
		for(int i=0; i< list.size(); i++) {
			
//			해당 문자열 단어가 2인 문자열인 경우 true
			if(booleans.test(list.get(i))) {
//				원소가 문자열 2인 단어만 출력
				System.out.println(list.get(i));
			}
			
		}
		
		
		
	}
}
