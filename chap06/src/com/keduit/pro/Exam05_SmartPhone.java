package com.keduit.pro;

public class Exam05_SmartPhone extends Exam05_Telephone{

	private String game;
	
	public Exam05_SmartPhone(String owner, String game) {
		super(owner, "when"); // 부모의 변수들
		this.game = game;
	}
	
	void playGame() {
		System.out.println(owner + "가 " + game +" 게임을 하는 중이다.");
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}
	
}
