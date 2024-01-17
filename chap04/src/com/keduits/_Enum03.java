package com.keduits;


class Dog extends _Enum03{
	
}

public class _Enum03 {

	public static void main(String[] args) {
		
		Gender gender = Gender.FEMALE;
		
		if(gender == gender.MALE) {
			System.out.println(gender.MALE + "은 병역 의무가 있다.");
		}else {
			System.out.println(gender.FEMALE + "은 병역 의무가 없다");
		}
		
		for(Gender g: Gender.values()) {
			System.out.println(g.name());
		}
		System.out.println(Gender.valueOf("MALE"));
		

	}
	
	enum Gender {
		MALE("남성"), FEMALE("여성");
		
		private String s;
		
		Gender(String s) {
			this.s = s;
		}
		
		public String toString() {
			return s;
		}
	}

}
