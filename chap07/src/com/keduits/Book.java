package com.keduits;

public class Book implements Comparable<Book>{
//	Comparable 인터페이스 : 객체들간의 정렬을 할 때 제공되는 인터페이스
//	compareTo() 메서드는 객체를 다른 객체와 비교하여 현재 객체가 다른 객체보다 작은지, 같은지, 큰지를 결정
//	이러한 비교 동작은 객체들을 정렬할 때 유용하게 활용
//	Comparable<Book> : Book 라는 클래스의 객체를 비교 할 수 있는 방법을 제공
//	<Book> : 제네릭 타입?으로 나타난다.
	int price;

	Book(int price) {
		this.price = price;
	}

	void sort() {
		System.out.println("Book [price=" + price + "]");
	}

	int getPrice() {
		return price;
	}

	@Override
	public int compareTo(Book b) { // Comparable의 추상메소드
		return getPrice() - b.getPrice();
//		compareTo(Book b) 메소드 관련 자료입니다. 참고 하시길 바랍니다
		
//		음수(-): 현재 객체가 비교 대상 객체보다 작은 경우
//		0: 현재 객체와 비교 대상 객체가 같은 경우
//		양수(+): 현재 객체가 비교 대상 객체보다 큰 경우
		
//		return getPrice() - b.getPrice(); || 오름차순 기준
		
//		1. 음수(-): 현재 객체가 비교 대상 객체보다 작은 경우, 오름차순으로 정렬
//		"(getPrice() 객체가 b.getPrice() 객체보다 앞으로 간다)"
		
//		2. 0: 두 객체의 값이 같으므로, 순서는 유지
		
//		3. 양수(+): 현재 객체가 비교 대상 객체보다 큰 경우, 오름차순으로 정렬 
//		"(getPrice() 객체가 b.getPrice() 객체보다 뒤로 갑니다.)"
		
		
//		return b.getPrice() - getPrice(); || 내림차순 기준
		
//		1. 음수(-): 비교 대상 객체가 현재 객체보다 작은 경우, 내림차순으로 정렬
//		((getPrice() 객체가 b.getPrice() 객체보다 앞으로 감)
		
//		2. 0: 두 객체의 값이 같으므로, 순서는 유지됩니다.
//		
//		3. 양수(+): 비교 대상 객체가 현재 객체보다 큰 경우 내림차순으로 정렬
//		(getPrice() 객체가 b.getPrice() 객체보다 뒤로 갑니다.)
		
	}
}
