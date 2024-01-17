package com.keduits;

import java.util.Arrays;

public class Exam01_ArraysTest {

	public static void main(String[] args) {

//		Exam01이라는 클래스에 정적필드 stringlist 변수 값을 래퍼런스 참조형 변수인 list에 대입
		Character[] list = Exam01_Arrays.stringlist;
		
//		래퍼런스는 주고값을 가리키고 있기 때문에 prinln으로 출력 시 주소값이 나온다.
//		System.out.println(list);
		
//		문제에서 정렬 전 : K o r e a n 나오게 하기 위해
//		향샹된 for문을 이용해서 출력
		System.out.print("정렬 전 : ");
		for(Character lists:list) {
			System.out.print(lists + " ");
		}
//		위 print 메서드를 사용 했기 때문에 println으로 줄바꿈 사용
		System.out.println();
		
//		Arrays.sort
//		1. 첫번째 인자값 : list의 배열 {'K', 'o','r','e','a','n'}
//		2. 두번째 인자값 : 받은 배열로 정렬 기준을 준다.
//		2-1 Character.compare : 정적 메서드를 사용하기 위해 매개값 2개
//		2-2 배열을 전부 소문자로 변환 후 비교한다.(c1(k) - c2(k ~ n)
//		c1이 c2보다 사전적으로 앞에 있다면 음수를 반환
//		c1이 c2와 같다면 0을 반환
//		c1이 c2보다 사전적으로 뒤에 있다면 양수를 반환
		Arrays.sort(list, (c1, c2) -> // 오름차순 c1 : 기준값 c2 : 상대값
		Character.compare(Character.toLowerCase(c1), Character.toLowerCase(c2)));

//		정렬된 값을 출력하기 위해 Arrays.toString(list)을 준다.
//		list 주면 주소값이 나오기 때문
//		System.out.println(Arrays.toString(list));

		
//		그냥 출력하면 배열로 나오기 때문에 향상된 for문 이용해서 값을 한개씩 출력
//		list라는 Character 래퍼런스 변수이기 때문에 lists도 Character 타입으로 주면된다.
		System.out.print("정렬 후 : ");
		for (Character lists : list) {
//			정렬 된 문자가 한개씩 출력
			System.out.print(lists + " ");
		}

	}

}
