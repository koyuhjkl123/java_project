package com.keduit;
import java.util.Scanner;

import ch10.BirthDay;

public class keduitTest {
	int x = 5;
	int s = 6;
	
	int up;
	int down;
	
	class more{
		int x;
		int s;
		public void add(int x, int s) {
			this.x = x;
			this.s = s;
		}
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public void Result(int x, int s) {
		System.out.println("참조" + x+s);
		this.x = x;
		this.s = s;
	}
	
	public static void Results(int c, int d) {
		
		if(c % d == 0 ) {
			System.out.printf("%d는 %d의 배수입니다", c,d);
		}else {
			System.out.printf("%d는 %d의 배수아닙니다.", c,d);
		}
	}
	public static int Re(int e, int f) {
		return e+f;
	}
	
	public void sum(int _up, int _down) {
		up = _up;
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(0b0110 << 2); // 011000 : 24
		System.out.println(0b1001 >> 2); // 0001 : 1
		// 0110 <<2 : 011000// 110000
		
		int num = add(5,15);
		System.out.println(num);
		
		
		keduitTest ms = new keduitTest();
		
		BirthDay day = new BirthDay();
		
		ms.Result(5, 8);
//		int test = Result(5,7); static키워드 변수를 지정해야 가능 아니면 에러
		ms.Results(25, 3);
		day.setDay(8);
		day.setMonth(12);
		day.setYear(23);
		day.showDate();
//		int mc = Results(5,9); 에러

	}
	
	
}
