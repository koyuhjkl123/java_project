package com.keduit;

public class Student {
	
	public enum Sex{MALE, FEMALE};
	public enum City{SEOUL, BUSON};
	
	
	String name;
	int score;
	private Sex sex;
	private City city;
	
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public Student(String name, int score, Sex sex) {
		this.name = name;
		this.score = score;
		this.sex = sex;
	}
	public Student(String name, int score, Sex sex, City city) {
		this.name = name;
		this.score = score;
		this.sex = sex;
		this.city = city;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public Sex getSex() {
		return sex;
	}
	public City getCity() {
		return city;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
