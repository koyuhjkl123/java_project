package com.keduit;

class A{}

class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}


public class _24_CastingTest {

	public static void main(String[] args) {
		
		B b = new B(); // A 포함
		C c = new C(); // A 포함
		D d = new D();
		E e = new E();
		
		A a1 = b; // 가능
		A a2 = c; // 가능
		A a3 = d; // 가능
		A a4 = e; // 가능
		
		B b1 = d; // 가능
		C c1 = e; // 가능
		
//		B b3 = e; // 상속 관계에 없어서 에러
//		C c2 = d; // 상속 관계에 없어서 에러

	}

}
