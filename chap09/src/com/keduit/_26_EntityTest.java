package com.keduit;

public class _26_EntityTest {

	public static void main(String[] args) {

		_25_Entity<String, Integer> e1 = new _25_Entity<>("홍길동", 20);

		_25_Entity<String, String> e2 = new _25_Entity<>("기타", "등등");

		System.out.println(e1);
		System.out.println(e2);
		e1.setKey("한정교");
		e1.setValue(30);
		e2.setKey("Hello");
		e2.setValue("안녕");
		System.out.println(e1.toString());
		System.out.println(e1.getKey() + ", " + e1.getValue());
		System.out.println(e2.toString());
		System.out.println(e2.getKey() + ", " + e2.getValue());
	}

}
