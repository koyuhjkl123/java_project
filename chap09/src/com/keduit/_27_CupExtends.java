package com.keduit;

public class _27_CupExtends<T extends _18_Beverage> {
// _18_Beverage클래스의 후손들만 T에 들어 올 수 있다.
	
//	T : _18_Beverage, _19_Beer, _20_Boricha 타입의 클래스만 가능
	private T beverage;
	
	public T getBeverage() {
		return beverage;
	}
	
	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String toString() {
		return "beverage : " + this.beverage;
	}
	
	
}
