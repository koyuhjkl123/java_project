package com.keduit;


import static java.util.Arrays.sort;

import java.util.Arrays;
import java.util.Calendar;


public class _07_StaticImportTest {

	public static void main(String[] args) {
		
		int[] data = {3, 5, 1, 7};
		sort(data);
		System.out.print(Arrays.toString(data)); // 클래스명.메서드
		System.out.println(Calendar.JANUARY);
		System.out.println(Calendar.getInstance());
		
		

	}

}
