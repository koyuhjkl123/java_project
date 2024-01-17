package com.keduitts;

public class _02_StudentTest {
	
	

	public static void main(String[] args) {

		_01_Student student = new _01_Student("홍길동", 14);
		
//		System.out.println("name = " + student.name);
//		System.out.println("number = " + student.number);
		
		student.setName("홍길동");
		student.setNumber(14);
		System.out.println(student.getName());
		System.out.println(student.getNumber());
	}

}
