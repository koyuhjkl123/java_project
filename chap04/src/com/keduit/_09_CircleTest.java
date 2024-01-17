package com.keduit;


public class _09_CircleTest {

	public static void main(String[] args) {

		_09_Circle c1 = new _09_Circle(10.0);
		_09_Circle c2 = new _09_Circle(5.0);

		System.out.println("원의 개수 : " + _09_Circle.numOfCicle);
		System.out.println("원의 갯수 : " + c1.numCircle);

		System.out.println("c2원의 갯수 : " + _09_Circle.numOfCicle);
		System.out.println("c2원의 갯수 : " + c2.numCircle);
		

		_09_CircleTest ct = new _09_CircleTest();
		ct.print();
	}

	public void print() {
		System.out.println("인스턴스 메서드입니다.");

	}
}
