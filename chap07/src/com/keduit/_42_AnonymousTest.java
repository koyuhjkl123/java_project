package com.keduit;

public class _42_AnonymousTest {

	public static void main(String[] args) {
		
		_41_Anonymous a = new _41_Anonymous();
		a.field.wake(); // 
//		a.field.work(); field가 Person type으로 new 되었으므로 work메소드가 없다.
		
		a.method1();
		a.method2(new _40_Person());
		
		a.method2( 
				new _40_Person() {
					
					@Override
					void wake() {
						System.out.println("8시에 일어납니다.");
						study();
					}
					
					void study() {
						System.out.println("공부합니다.");
					}
				}
				);
	}

}
