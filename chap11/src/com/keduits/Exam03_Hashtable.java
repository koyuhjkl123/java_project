package com.keduits;

public class Exam03_Hashtable {
	
	String name;
	int number;
	
	
	public Exam03_Hashtable(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String toString() {
		return String.format("%d", number);
	}
	

}
