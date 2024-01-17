package com.keduit;

public class _22_CupTest {

	public static void main(String[] args) {
		
		_21_Cup<_20_Boricha> cup1 = new _21_Cup<>();
		_21_Cup<_19_Beer> cup2 = new _21_Cup<>();

		
		cup1.set(new _20_Boricha()); // set으로 _20_Boricha 객체 전달
		_20_Boricha b = cup1.get(); // 값을 b에 넣는다.
		System.out.println(b);
		
		cup2.set(new _19_Beer());
//		_19_Beer bb = cup2.get();
//		System.out.println(bb);
		System.out.println(cup2.get());
	}

}
