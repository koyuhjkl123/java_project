package com.deduit;

public class _16_ConstantTest {

	public static void main(String[] args) {
		
		final int MALE = 0;
		final int FEMAIL = 1;
		final int SOUTH = 1;
		int gender = FEMAIL;
		
		System.out.println(gender);
		
		if(gender == MALE) {
			System.out.println(MALE + "은 병역의 의무가 있다.");
		}else {
			System.out.println(FEMAIL + "은 병역의 의무가 없다");
		}
		
		if(gender == SOUTH) {
			System.out.println(SOUTH + "은 누구");
		}
		gender = 5;

	}

}
