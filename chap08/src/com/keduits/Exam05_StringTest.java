package com.keduits;

import java.sql.Date;

public class Exam05_StringTest {

	public static void main(String[] args) {

		show(new String("멘붕"));
		show(new StringBuilder("meltdown"));
		show(new StringBuffer("!@#"));
		show(new Date(2));

	}

//	Object클래스는 최상위 클래스이기 때문에
//	show()메서드 매개 타입을 Object으로 하면 된다.
	public static void show(Object obj) {
		System.out.println(obj);
	}
}
