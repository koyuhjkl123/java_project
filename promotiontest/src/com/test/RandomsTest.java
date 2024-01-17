package com.test;

public class RandomsTest {

	public static void main(String[] args) {
		
		
		
		String[] UserNumber = {"10", "7", "33", "42", "17","41"};
		Randoms sc = new Randoms();
		
		String[] randomLottoNumber = Randoms.generateLottoNumbers(); 

		
		System.out.println("생성된 로또 번호 : ");
		
		for(String numbers : randomLottoNumber) {
			System.out.println(numbers+" ");
		}
		System.out.println();
		
		
		Randoms.checkWinning(UserNumber);
		
	}

}
