package com.keduit;

public class _06_SmartPhone extends _05_Phone{
	// Phone의 자식클래스
	
	
	public _06_SmartPhone(String owner){
		super(owner); // 부모 클래스 생성자 호출
	}

	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}
}
