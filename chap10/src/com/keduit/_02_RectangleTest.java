package com.keduit;

import java.util.Arrays;

public class _02_RectangleTest {

	public static void main(String[] args) {
		
		_01_Rectangle[] recs = {new _01_Rectangle(5, 4),
				new _01_Rectangle(7, 5), new _01_Rectangle(7, 2)};

		Arrays.sort(recs);
//		sort는 정렬, 기준을 주는 메서드 : compareTo
		
		
		for(_01_Rectangle r : recs) {
			System.out.println(r);
		}
	}

}
