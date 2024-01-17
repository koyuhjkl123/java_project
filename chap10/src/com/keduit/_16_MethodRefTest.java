package com.keduit;

public class _16_MethodRefTest {

	public static void main(String[] args) {

		_13_Mathemtical m;
		_14_Pickable p;
		_15_Computable c;
		
		m = d -> Math.abs(d);
		
//		static 메소드 참조
		m = Math::abs; // 절대값
		
		System.out.println(m.calculate(-100.6));
		
		p = (a, b) -> a.charAt(b);
		
		// instance method
		p = String :: charAt;
		
		System.out.println(p.pick("안녕, 인스턴스메소드 참조", 4));
		
		_12_Utils u = new _12_Utils();
		c = (a, b) -> u.add(a, b);
		// instance method 참조(참조변수명 :: 메소드)
		
		c = u :: add;
		
		System.out.println(c.compute(10, 20));
	}

}
