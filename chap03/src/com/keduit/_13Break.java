package com.keduit;

public class _13Break {
	
	int i = 0; // 멤버변수 // 인스턴스 변수
	static int x = 0; // 클래스변수

	public static void main(String[] args) {
		
		int i = 1;
//		int j = 5;
		
//		
//		while(true) {
//			System.out.println(i++);
//			if(i >= j) {
//				break;
//			}
//		}
		
		for(i=1; i < 10; i++) {
			
			
			if(i % 2 == 0) {
				continue;
			}
			System.out.print(i);
		}
		System.out.println();
		i = 0;
		while(i < 10) {
			i++;
			if(i % 2==0 ) {
				continue;
			}
			System.out.print(i);
		}
		
		
		

	}

}
