package com.keduit;

public class _28_BoundedTypeTest {

	public static void main(String[] args) {
		
		_27_CupExtends<_18_Beverage> c1 = new _27_CupExtends<>();
//		_10_Apple은 _18_Beverage의 상속 관계인 자식클래스가 아니기 때문에 오류가 발생
//		_27_CupExtends<_10_Apple> c2 = new _27_CupExtends<_10_Apple>();
		_27_CupExtends<_19_Beer> c2 = new _27_CupExtends<>(); // ㅜㅕ
		_27_CupExtends<_20_Boricha> c3 = new _27_CupExtends<>(); 
		
//		
//		c1.setBeverage(new _18_Beverage());
//		c2.setBeverage(new _19_Beer());
//		c3.setBeverage(new _20_Boricha());
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
