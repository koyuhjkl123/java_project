package com.keduits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exam08_CollectionsTest {

	public static void main(String[] args) {
		
		String[] s= {"독수리", "고양이", "강아지"};
		
		List<String> list = new ArrayList<String>(List.of("개미", "개미"));

		System.out.println(list);
		
		List<String> al1 = new ArrayList<String>(list);
		System.out.println("nCopies : " + al1);
		
//		al1의 있는 '개미'라는 값을 전부 벌로 변경하겠다.
		al1.replaceAll(a-> String.join("개미", "벌"));
		System.out.println("'벌'을 채운 후 : " + al1);
		
//		s문자열을 List으로 변환 후 al1 모두 추가
		al1.addAll(Arrays.asList(s));
		System.out.println("리스트를 모두 추가한 후 : " + al1);
		
//		al1 값을 정렬
		Collections.sort(al1);
		System.out.println("리스트를 섞은 후 : " + al1);
		
//		Collections.sort(값, 기준) Comparator.reverseOrder() 역순으로 정렬
		Collections.sort(al1, Comparator.reverseOrder());
		System.out.println("리스트를 역순으로 정렬한 후 : " + al1);
		
		System.out.println("리스트에서 최소 : " + Collections.min(al1));
		System.out.println("리스트에서 최대 : " + Collections.max(al1));
		System.out.println("리스트에서 '벌'의 빈도 : " + Collections.frequency(al1, "벌"));
	}

}
