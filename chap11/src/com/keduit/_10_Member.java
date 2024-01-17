package com.keduit;

public class _10_Member {

	private String name;
	private int age;

	public _10_Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof _10_Member) { // 타입인지
//			부모클래스 타입을 자식클래스 타입으로 형변환(다운 캐스팅)
			_10_Member member = ((_10_Member) obj);
//			member의 name과 age의 값이 전달받은 name, age 같은면 동일 객체 
			return member.name.equals(name) && (member.age == age);
		}
//		타입이 아니라면 false
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + name + ", " + age + "]";
	}

}
