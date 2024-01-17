package com.keduit;

public class _08_Person {

	String name;
	int age;
	
	public _08_Person setName(String name) {
		this.name = name;
		return this;
	}
	
	
//	public _08_Person setAge(int age) {
//		this.age = age;
//		return this;
//	}
	public int setAge(int age) {
		this.age = age;
		return age;
		
	}
	
	public void print() {
		System.out.println("안녕 나는 " + name+" 이고, "+ age + "살이야." );
	}
}
