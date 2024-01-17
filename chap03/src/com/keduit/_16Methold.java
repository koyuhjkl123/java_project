package com.keduit;
import java.util.Scanner;

class Methold {
	
	static int factorial(int x) {
		int r = 1;

		for (int i = 1; i <= x; i++) {
			r *= i;
		}
		return r;
	}
	
	int factorial(int x, int y) {
		int r= 1;
		
		for(; x <=y; x++) {
			r *= x;
		}
		
		return r;
	}
	
}

public class _16Methold {

	public static void main(String[] args) {

		Methold scc = new Methold();
		int result = 1;
		int n;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("팩토리얼 값을 구할 정수");
		n = scanner.nextInt();
//		
		//1번
//		for (int i =1; i <= n; i++) {
//			result *= i;
//		}
//		System.out.println(result);
		
		// 3번
//		while(n >0) {
//			result *= i;
//			n--;
//
//		}
//		System.out.println(result);
		
		// 5번
//		while(true) {
//			for (int i =1; i <= n; i++) {
//				result *= i;
//			}
//			break;
//		}
//		System.out.println(result);
		

		System.out.println(Methold.factorial(5));
		System.out.println(scc.factorial(1,5));
		System.out.println(scc.factorial(3,5));
		System.out.println(scc.factorial(10,5));

	}
}
