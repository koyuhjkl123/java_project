package com.keduits;


public class Exam01_Circle {
	
	int radius;
	
	public Exam01_Circle(int radius) {
		this.radius = radius;
	}
	
	
	@Override // equals메소드의 오버라이드
	public boolean equals(Object obj) {
		Exam01_Circle ct =(Exam01_Circle)obj; // 다운캐스팅
		
		if(ct instanceof Object) {
			return this.radius == ct.radius;
		}else {
			return false;
		}
		
//		if(obj instanceof Object) {
//			Exam01_Circle ct = (Exam01_Circle) obj;
//			return this.radius == ct.radius;
//		}else {
//			return false;
//		}
		
		
		
	
		
	}
	

	
}
