package com.deduit;

public class _13_CircleTest {
	
	public static void main(String[] args) {

		_13_Circle[] circles = new _13_Circle[5];
		

		for (int i = 0; i < circles.length; i++) {
			circles[i] = new _13_Circle(i + 10.0); // _13_Circle[] 배열의 타입이라서 new사용
			System.out.printf("원의 넓이(반지름: %.1f) = %.2f\n", circles[i].getRadius(), 
					circles[i].findArea());
			System.out.println(circles[i]);
		}
		
		

	}

}
