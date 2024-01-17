package com.deduit;

public class _22_SwitchEnumTest {

	public static void main(String[] args) {
		_23_Gender gender = _23_Gender.여성;

		String s = switch (gender) {
		case 남성 -> "은 병역 의무가 있다.";
		case 여성 -> "은 병역 의무가 없다.";
		};
		System.out.println(gender + s);
	}

}
