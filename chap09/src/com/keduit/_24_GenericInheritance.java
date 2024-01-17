package com.keduit;

import java.util.ArrayList;

public class _24_GenericInheritance {

	public static void main(String[] args) {
		
		ArrayList<_18_Beverage> list1 = new ArrayList<_18_Beverage>();
		
		list1.add(new _19_Beer());
		list1.add(new _20_Boricha());
		
		list1.add(new _18_Beverage());
		
		beverageTest(list1);
		
		ArrayList<_19_Beer> list2 = new ArrayList<_19_Beer>();
		list2.add(new _19_Beer());
//		list2.add(new _20_Boricha());
//		list2.add(new _18_Beverage()); 부모클래스도 안됨
//		beverageTest(list2);
		

	}
	
	public static void beverageTest(ArrayList<_18_Beverage> list) {
		System.out.println(list);
	}

}
