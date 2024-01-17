package com.keduit;

public class Promotion {
	
	String userId;
	String userphone;
	String userName;
	
	
	
	public Promotion() {}
	public Promotion(String userId, String userphone, String userName) {
		
		this.userId = userId;
		this.userName = userName;
		this.userphone = userphone;
	}
	
	public void showPromotionInfo() {
		System.out.println("유저 ID : " + userId + "이고, 이름은 " + userName + "이고, 유저의 폰 : " + userphone);
		
	}
	public String showPromotionInfos() {
		return "유저 ID : " + userId + "이고, 이름은 " + userName + "이고, 유저의 폰 : " + userphone;
	}
}


