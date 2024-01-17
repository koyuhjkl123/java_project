package com.keduit;

import java.util.HashSet;
import java.util.Set;

public class _08_HashSet2Test {

	public static void main(String[] args) {
		
		Set<_09_Fruit> fruits = new HashSet<_09_Fruit>();
		
//		new로 하여 생성자가 매개변수 1개 있는 name값을 주기 위해
		fruits.add(new _09_Fruit("사과"));
		fruits.add(new _09_Fruit("사과"));
		System.out.println(fruits.size());
		System.out.println(fruits);
		
	}

}
