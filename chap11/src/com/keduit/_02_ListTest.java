package com.keduit;

import java.util.Arrays;
import java.util.List;

public class _02_ListTest {

	public static void main(String[] args) {

		String[] animals1 = { "사슴", "토끼", "고양이", "곰" };

//		배열타입인 animals1을 리스트타입인 animals2 변수 변환
		List<String> animals2 = Arrays.asList(animals1);
		System.out.println(Arrays.toString(animals1));
		System.out.println(animals2);

		System.out.println(animals2.get(1));
		animals2.set(1, "거북이");
		System.out.println(animals2);
//		asList 생성한 리스트는 추가 불가
//		이유 : 배열에서 리스트로 변환되어서 추가는 불가
//		animals2.add("토끼"); // error

//		추가뿐만 아니라 삭제도 불가
//		animals2.remove(1); //error

		for (String s : animals2) {
			System.out.print(s + " ");
		}
//		System.out.println(animals2);

		animals2.sort((x, y) -> x.length() - y.length());
		System.out.println(animals2);
		
		String[] animals3 = animals2.toArray(new String[0]);
		
		
		for(String s : animals3) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		List<String> car = List.of("그랜져", "소나타", "아반테", "제네시스");
//		car.set(1, "싼타페");// List.of로 생성한 불변
//		car.forEach(null); 

		
//		car.add("에쿠우스); List.of은 불변이라 추가, 삭제, 변경 다 안됨
		car.forEach(s -> System.out.println(s + " "));
		
//		of()메소드는 사용하여 생성할때 null 허용 안됨
//		List<Object> object = List.of("abc", null);
		
		String[] animals5 = animals2.toArray(new String[8]);
		System.out.println(Arrays.toString(animals5));
		List<String> animals6 = Arrays.asList(animals5);
		System.out.println(animals6);
	}

}
