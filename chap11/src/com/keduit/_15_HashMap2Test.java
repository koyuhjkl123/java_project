package com.keduit;

import java.util.HashMap;
import java.util.Map;

public class _15_HashMap2Test {

	public static void main(String[] args) {
		
		Map<_09_Fruit, Integer> map = new HashMap<_09_Fruit, Integer>();
		
		map.put(new _09_Fruit("사과"), 5);
		map.put(new _09_Fruit("사과"), 2);
		map.put(null,  3);
		
		System.out.println(map.size());
		System.out.println(map);

	}

}
