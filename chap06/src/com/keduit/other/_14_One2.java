package com.keduit.other;

import com.keduit._11_One;
import com.keduit._12_One1;




public class _14_One2 extends _11_One{
	
	void print() {
		_11_One o = new _11_One();
		_12_One1 o1 = new _12_One1();
		
//		System.out.println(secret); // private
//		System.out.println(roommate); // default
		System.out.println(child); // protected
		System.out.println(anybody); // 다른 패키지라면 public 만 멤버에 접근이 가능함
	}
	
	public static void main(String[] args) {
		
		
		
		
		
	}

}
