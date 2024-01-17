package com.keduit;

import java.util.ArrayList;
import java.util.List;

public class _03_ArrayListTest {

	public static void main(String[] args) {

		List<String> list = List.of("그랜저", "소나타", "아반테", "제네시스", "소을");
		
		System.out.println(list.indexOf("소나타"));
		System.out.println(list.contains("싼타페"));
		
		List<String> cars1 = new ArrayList<>(list);
		cars1.add("싼타페");
		List<String> cars2 = new ArrayList<String>(list);
		cars2.remove("제네시스");
		System.out.println(cars1.containsAll(cars2));
		
		cars1.removeIf(c->c.startsWith("소"));
		System.out.println(cars1);
		
		cars1.replaceAll(s-> "뉴" + s);
		System.out.println(cars1);
		
		cars1.forEach(s-> System.out.print(s + " "));
		System.out.println();
		
		cars1.clear();
		System.out.println(cars1.isEmpty());
	}

}
