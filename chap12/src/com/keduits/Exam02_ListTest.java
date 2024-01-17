package com.keduits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam02_ListTest {

	public static void main(String[] args) {
		
		List<String> s1 = new ArrayList<>(Arrays.asList
				("서울", "워싱턴", "베이징", "파리","마드리드", "런던"));

		
//		s1 리스트에 스트림을 생성한다 stream
//		s1 스트림을 생성한 후 사전순으로 정렬한다.
//		s1의 첫번째 원소값을 get()으로 반환하여 출력한다.
		System.out.println(s1.stream().sorted().findFirst().get());
	}

}
