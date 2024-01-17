package com.keduits;

public class Exam06_Population {
	
//	문제에서 Exam06_Population 클래스에서
//	수도이름과 인구수를 필드 만들고 각 생성자와 모든 getter메서드를 정의
//	toString 메서드도 오버라이딩 정의해야한다.

	String capital; // 수도이름
	double population; // 수도 인구수

	public Exam06_Population(String capital, double population) { // 생성자
		this.capital = capital;
		this.population = population;
	}
	
	public String getCapital() { // 수도이름의 getter
		return capital;
	}
	
	public double getPopulation() { // 인구수의 getter
		return population;
	}
	
	@Override
	public String toString() { // 오버라이딩
		return capital +"("+population+")";
	}

	

}
