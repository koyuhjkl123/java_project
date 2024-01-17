package com.kediuts;


public class Exam01_MyDateTest{

	public static void main(String[] args) {
		
//		객체가 null 이라서 NullPointerException 오류 발생
//		Exam01_MyDate d = null;
		
		
		try {
			Exam01_MyDate d = null;
//			결과 : 2035년 12월 25일로 나오게 해야 한다.
			System.out.printf("%d년 %d월 %d일\n", d.year, d.month,d.day);
		} catch (NullPointerException e) {
			Exam01_MyDate d = new Exam01_MyDate();
			System.out.printf("%d년 %d월 %d일\n", d.year, d.month,d.day);
		}
		
		


	}

}
