package com.keduit;

public class _14_Coin2 implements _12_Coin{ // Coin2이가 Coin 인터페이스
	public static void main(String[] args) {
		
		System.out.println("Dime은 " + DIME + " 센트입니다.");
//		_14_Coin2클래스가 _12_Coin 인터페이스에 implements 했기 때문에
//		interface _12_Coin.DIME 사용 안해도 바로 필드로 사용이 가능
	}

}
