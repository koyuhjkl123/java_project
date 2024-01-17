package com.keduits;

public class Exam02 {

	
	private double bese, hight;
	
	
	double getBese() {
		return bese;
	}
	
	double getHight() {
		return hight;
	}
	public double findArea() { // 넓이 구하는 결과 값을 리턴
		return bese * hight * 0.5;
	}
	
	Exam02(double bese, double hight){
		// Exam02클래스 생성자/ 
		this.bese = bese;
		this.hight = hight;
	}
	
	
	public boolean isSameArea(Exam02 findArea1) { 
		
		//매개변수 findArea1가 가리키는 Exam02 클래스 객체의 면적과 현재 객체의 면적을 비교
		if(findArea() == findArea1.findArea()) {
			// t1.isSameArea(t3) : 두 객체의 면적을 비교하여 같은 면적이면 true를 반환
			return true; // 두 객체가 같으면 true
		}else {
			return false; // 두 객체가 다르면 false
		}
	}


}
