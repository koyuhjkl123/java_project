package com.keduit;

public class NumberTypeTest {

	public static void main(String[] args) {
		
		int fifteen = 15;
		byte fifteen_binary = 0b1111;
		short fifteen_oat = 017;
		int fifteen_hexa = 0xF;
		long lightSpeed = 300000l;
		
		System.out.println(fifteen);
		System.out.println(fifteen_binary);
		System.out.println(fifteen_oat);
		System.out.println(fifteen_hexa);
		System.out.println(lightSpeed);
		
		
		int match;
		int distance;
		match = 340;
		
		distance = match * 60 *60;
		
		System.out.println("소리가 1시간 동안 가는 거리 : " + distance +"m");
		
		double radius;
		double area;
		radius = 10.0;
		area = radius * radius * 3.14;
		
		System.out.println("반지름이 " + radius + "인 원의 넓이 : " + area);

	}

}
