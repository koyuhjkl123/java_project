package com.keduit;

public class OperatePromotion {

	public static void main(String[] args) {
		
		
		short num1 = 11;
		short num2 = 22;
		
//		정수형 리터럴은 상수들에 int로 등록되므로
//		연산에 참여힐 때에는 int로 적용된다.
//		그러므로 연산 후 형변환이 필요
		short result = (short) (num1 + num2); // 형변환 후 대입
		System.out.println(result);
		
		
	}

}
