package com.keduits;

public class _06_SutdaDeck {

//	문제 설명
//	Q1. 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다. 
//    섯다카드 20장을 담는 SutdaCard배열을 초기화하시오. 
//    단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고, 
//    숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이어야 한다. 
//    즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.

	final int CARD = 20; // 카드 숫자

	SutdaCard[] cards = new SutdaCard[CARD];

	_06_SutdaDeck() {

		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			cards[i] = new SutdaCard(num, isKwang);
		}
	}

}
