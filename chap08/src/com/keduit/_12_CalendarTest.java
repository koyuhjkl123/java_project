package com.keduit;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class _12_CalendarTest {

	public static void main(String[] args) {
		
		Date n1 = new Date();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf.format(n1));
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "년 " + month + "월 " + day + "일");

		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
	}

}
