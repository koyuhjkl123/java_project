package com.keduit;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class _15_SimpleDateFormatTest {

	public static void main(String[] args) {
		
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		
		System.out.println(sdf2.format(d));

		String s = "2023-12-25";
		try {
			d =sdf2.parse(s);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println("parse에러가 났어요");
			
		}
		System.out.println(sdf2.format(d));
		
		Calendar c = Calendar.getInstance();
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("E yyyy.MM.dd" , Locale.JAPAN);
		System.out.println(sdf3.format(c.getTime()));
		
		
	}
}
