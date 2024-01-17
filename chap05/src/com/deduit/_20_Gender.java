package com.deduit;

public enum _20_Gender {
	
	MALE("남성"), FEMALE("여성");
	
	
	private String s;
	_20_Gender(String s){
		this.s = s;
	}
	
	public String toString() {
		return s;
	}

}
