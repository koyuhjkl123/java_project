package com.keduit;

public class _23_CupTest2 {

	public static void main(String[] args) {
		_21_Cup c = new _21_Cup();
		_21_Cup b = new _21_Cup();
		
		c.set(new _19_Beer());
		b.set(new _20_Boricha());
		
		_19_Beer beer = (_19_Beer)c.get(); // 제네릭을 사용 하지 않을 경우 형 변환을 해야한다.
		_20_Boricha boricha = (_20_Boricha)b.get();

		System.out.println(beer);
		System.out.println(boricha);
		
		
		c.set("beer"); // 오류이지만 컴파일러에서 잡아 내지 못함
		System.out.println(c.get());
	}

}
