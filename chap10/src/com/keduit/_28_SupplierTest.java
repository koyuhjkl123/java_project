package com.keduit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class _28_SupplierTest {

	public static void main(String[] args) {

		Supplier<String> s1 = () -> "apple";
		System.out.println(s1.get());

		int[] x = { 0 };

		IntSupplier s2 = () -> x[0]++;
		for (int i = 0; i < 10; i++) {
			System.out.println(s2.getAsInt());

		}
		
		DoubleSupplier s3 = () -> Math.random()*10;
		System.out.println(s3.getAsDouble());
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 (E요일) a hh:mm:ss");
		Supplier<String> s4 = () -> sdf.format(new Date());
		System.out.println(s4.get());

	}

}
