package com.keduit;

public class _01PhoneTest {

	public static void main(String[] args) {

		_01Phone phone = new _01Phone();

		phone.model = "갤럭시 S8";
		phone.value = 100;
		phone.print();

		System.out.println(phone);
		_01Phone yourphone = new _01Phone();

		yourphone.model = "아이폰";
		yourphone.value = 200;
		yourphone.print();
		System.out.println(yourphone);

	}

}
