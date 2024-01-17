package com.keduit;

public class _34_InnerInterfaceTest implements _33_Icon.Touchable{
	
	@Override
	public void touch() {
		System.out.println("아이콘을 터치한다.");
	}

	public static void main(String[] args) {

		_34_InnerInterfaceTest iit = new _34_InnerInterfaceTest();
		
		iit.touch();
		_33_Icon.Touchable it = new _34_InnerInterfaceTest();
		it.touch();
		
		
	}

}
