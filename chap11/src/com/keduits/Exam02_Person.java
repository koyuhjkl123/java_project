package com.keduits;

public class Exam02_Person {

	String name; // 이름
	int age; // 나이
	
	public Exam02_Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	@Override
	public String toString() {
		return String.format("Person[%s, %d]", name, age);
	}

	public boolean equals(Object o) {
		if(o instanceof Exam02_Person) {
			return ((Exam02_Person) o).name.equals(name);
		}else {
			return false;
		}
	}
	
	public int hashCode() {
		return name != null ? name.hashCode() : 0;
	}
	
	
}
