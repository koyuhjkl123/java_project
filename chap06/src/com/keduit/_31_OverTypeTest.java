package com.keduit;

public class _31_OverTypeTest {

	public static void main(String[] args) {

		_29_Vehicle v = new _30_Car();
		System.out.println(v.name); // 실체 객체 메서드라서 자식 클래스 메서드 가능
		v.whoami();
		v.move();
		
		// _29_Vehicle > _30_Car > _32_SportsCar / 상속 관계

		_29_Vehicle[] vs = new _29_Vehicle[2];

		vs[0] = new _30_Car();
		vs[1] = new _32_SportsCar();

		for (_29_Vehicle w : vs) {

			w.whoami();
		}

	}

}
