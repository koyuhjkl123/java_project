package com.keduit;

public class _35_InterfaceTest extends _33_Icon{
	
	public void touch() {
		System.out.println("터치");
	}
	
	
	public static void main(String[] args) {
		
		_35_InterfaceTest it = new _35_InterfaceTest();
		_33_Icon.Touchable it2 = new _34_InnerInterfaceTest();
		
		it.touch();
//		lt2.touch(); // 에러
	}

}
