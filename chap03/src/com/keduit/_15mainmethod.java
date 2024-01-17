package com.keduit;

public class _15mainmethod {
	
	
	public int add(int x, int y) {
		int sum = 0;
		for(int i=x; i <= y; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int ad(int x, int y) {
		int sum = 0;
		for(int i=x; i <= y; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		
		_15mainmethod s = new _15mainmethod();
		
		System.out.println(s.add(1,10));
		System.out.println(s.add(10,100));
		System.out.println(s.add(100,1000));
		
		System.out.println(_15mainmethod.ad(1,10));
		System.out.println(_15mainmethod.ad(10,100));
		System.out.println(_15mainmethod.ad(100,1000));
		

	}

}
