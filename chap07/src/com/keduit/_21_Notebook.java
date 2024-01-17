package com.keduit;

public class _21_Notebook extends _19_Computer implements _20_Portable{

	@Override
	public void inMyBag() {
		System.out.println("노트북은 노트북 가방에 있습니다.");
		
	}
	
	@Override
	public void turnOn() {
		System.out.println("노트북을 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("노트북을 끕니다.");
	}

	
	
}
