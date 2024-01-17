package com.deduit;

public class _15_CircleObjectTest {

	public static void main(String[] args) {

		_13_Circle c1 = new _13_Circle(10.0);
		_13_Circle c2 = new _13_Circle(10.0);

		zero(c1);
		System.out.println("c1의 반지름: " + c1.radius);

		zero(c2.radius);
		System.out.println("c2의 반지름: " + c2.radius);

	}

	public static void zero(_13_Circle Circle) { // 주소값 복제
//		circle 매개변수가 가리키는 클래스
		
		Circle.radius = 7.0;
//		클래스의 있는 필드 radius 값을 0.0대입
//		바라보는 객체 주소값이 동일하므로 값의 영향이 간다
	}

	public static void zero(double x) {// 값만 복제
//		기본형(double)타입이므로 값을 복제
		
//		매개변수 x와 zero(c2.radius) 메모리 영역이 공간 자체가 다르므로 영향이 없다
		x= 0.0;
	}

}
