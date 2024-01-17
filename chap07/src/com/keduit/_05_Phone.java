package com.keduit;

public abstract class _05_Phone {
	// 추상클래스도 인스턴스메소드도 만들 수 있다.
	// 클래스만 추상이며, 상속 받은 자식클래스에서 사용이 가능
	// 오버라이딩으로 하여 새로운 값을 정의 가능

	public String owner;
	
	public _05_Phone(String owner){
		// 부모(abstract)클래스의 생성자 
		this.owner = owner;
	}
	
	public void turnOn(){ // 폰 전원을 켜기 위한 메소드
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() { // 폰 전원을 끄기 위한 메소드
		System.out.println("폰 전원을 끕니다.");
	}
}
