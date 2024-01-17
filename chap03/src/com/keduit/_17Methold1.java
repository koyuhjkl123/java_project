package com.keduit;

public class _17Methold1 {
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
		
		int sum = 0;
		
		System.out.println("합(10~100) "+_15mainmethod.ad(1,10));
		System.out.println("합(100~1000) "+_15mainmethod.ad(10,100));
		System.out.println("합(100~1000) " +_15mainmethod.ad(100,1000));
		System.out.println("-----");
		
		_15mainmethod s = new _15mainmethod();
		
		System.out.println("합(10~100) "+s.add(1,10));
		System.out.println("합(100~1000) " +s.add(10,100));
		System.out.println("합(100~1000) "+s.add(100,1000));
		System.out.println("-----");
		
		for(int i =1; i <=10; i++) {
			sum += i;
		}
		System.out.println("합(10~100) " + sum);
		
		
		sum = 0;
		for(int i =10; i <=100; i++) {
			sum += i;
		}
		System.out.println("합(100~1000) " + sum);
		
		
		sum = 0;
		for(int i =100; i <=1000; i++) {
			sum += i;
		}
		System.out.println("합(100~1000) " + sum);
		System.out.println("-----");
		
		
		

	}


}
