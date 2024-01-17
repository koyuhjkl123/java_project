package com.deduit;

public class _21_EnumTest {

	public static void main(String[] args) {
		
		_20_Gender gender = _20_Gender.FEMALE;
		
		
		if(gender == _20_Gender.MALE) {
			System.out.println(_20_Gender.MALE+"은 병역의 의무가 있다");
		}else {
			System.out.println(_20_Gender.FEMALE+"은 병역의 의무가 없다.");
		}
		
		for(_20_Gender g : _20_Gender.values()) {
			System.out.println(g.name());
//			System.out.println(g);
		}
		
		System.out.println(_20_Gender.valueOf("MALE"));
		

	}

}
