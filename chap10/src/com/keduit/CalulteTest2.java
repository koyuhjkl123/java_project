package com.keduit;

public class CalulteTest2 {

	public static void main(String[] args) {

		//
		CalulteTest n;
		n = (a, b) -> {return a > b ? a : b;};
		//
		
		//
		CalulteTest3 s;
		s = (name, i) -> System.out.println(name + "=" + i);
		//
		
		//
		CalulteTest4 c;
		c = x -> x * x;

		//
		CalulteTest5 f;
		f = () -> (int) (Math.random()*6);
		//
		
		System.out.println(n.max(5, 7));
		s.printVar("홍길동", 17);
		System.out.println(c.square(5));
		System.out.println(f.roll());
	}

}
