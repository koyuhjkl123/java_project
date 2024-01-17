package com.deduit;

public class _13_Circle {

	double radius; // 필드 혹은 멤버 변수

	public _13_Circle() {
	}

	public _13_Circle(double radius) { // 클래스 생성자
		this.radius = radius;
	}

	public double getRadius() { // 필드 값을 리턴 받은 메소드
		return radius;
		// public으로 할경우 외부에서 직접적으로 접근은 가능하나
		// 정보은닉과 캡슐화 고려 할때 권장하는 객체지향 방식..
		// 유연한 코드를 위해서는 쓰는 것이 좋다

	}
//	public double getRadius(_13_Circle more) {
//		this.more = more.findArea();
//		return radius;
//		
//	}

	double findArea() { // 결과 값을 리턴해주는 메소드
		return 3.14 * radius * radius;
	}

	public String toString() { // 참조변수 출력 시 참조변수의 값을 나오게 된다.
		return "반지름이 " + radius + "인 원";
	}

}
