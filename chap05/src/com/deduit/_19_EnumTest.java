package com.deduit;

public class _19_EnumTest {

	public static void main(String[] args) {
		
		_17_Gender gender = _17_Gender.FEMALE;
		
		if(gender == _17_Gender.MALE) {
			System.out.println(_17_Gender.MALE + "은 병역의 의무가 있다.");
		}else {
			System.out.println(_17_Gender.FEMALE + "은 병역의 의무가 없다.");
		}
		
//		if(gender == _18_Direction.SOUTH) { // 에러 발생
//			System.out.println(_18_Direction.SOUTH+"는 누구?");
//		}
		

	}

}
