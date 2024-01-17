package com.keduits;


public class Exam04_Dice {
	
	int roll() { // 인스턴스 메서드

//		1 ~ 6 사이 정수 임의로 반환하는 것이기 때문에 +1를 해줘야한다.
//		(Math.random()*6) : 0 ~ 5까지 임의로 반환됨
		return (int) (Math.random()*6)+1;
		
	}

}
