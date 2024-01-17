package com.keduit;

public class PromotionTest {

	public static void main(String[] args) {
		
		Promotion pro = new Promotion("koyu", "010-1234-5678", "홍길동");
		
		
		
		pro.showPromotionInfo();
		
		
		Promotion ps = new Promotion(); // 생성자
		
		ps.userId = "test";
		ps.userphone = "010-8765-4321";
		ps.userName = "이순신";
		
		System.out.println(ps.showPromotionInfos()); // 메소드 호출
		

	}

}
