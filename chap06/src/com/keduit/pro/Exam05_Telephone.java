package com.keduit.pro;

public class Exam05_Telephone extends Exam05_Phone{

	private String when;
	
	public Exam05_Telephone(String owner, String when) {
		super(owner); // 부모의 변수
		this.when = when;
	}
	
	void autoAnswering() {
		System.out.println(owner + "가 없다 " + when +" 전화 줄래");
	}

	public String getWhen() {
		return when;
	}

	public void setWhen(String when) {
		this.when = when;
	}
}
