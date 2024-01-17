package com.keduit;
import ch10.BirthDay;
public class sangaTest {
	
	private int name; /// 
	
	
	public static void show() {
		System.out.println(58);

	}
	
	
	
	

	public static void main(String[] args) {
		
		BirthDay day = new BirthDay();
		
		sangaTest sangaTest = new sangaTest();
		sangaTest.show();
		show();
		
		day.setDay(8);
		day.setMonth(7);
		day.setYear(25);
		day.showDate();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for(int i=0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				
//					System.out.print("*");
//					System.out.print(" ");
//				
//			}
//			System.out.println();
//		}
		
		// i: 행
		for (int i = 0; i < 5; i++) {
		  // j: 열
		  for (int j = 0; j < i; j++) {
			  System.out.print(" ");
		  }
		  for(int j=5; j > i; j--) {
			  System.out.print("*");
			  
		  }
		  System.out.println();
		}
	}

}
