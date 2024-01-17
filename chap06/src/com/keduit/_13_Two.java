package com.keduit;

public class _13_Two {
	
	void print() {
		
		_11_One o = new _11_One();
//		System.out.println(o.secret); private 때문에 접근 불가
		
//		private 외 접근 가능하지만 자신의 멤버가 아니기 때문에 객체를 생성해야 한다.
		System.out.println(o.roommate);
		System.out.println(o.child);
		System.out.println(o.anybody);
	}

}
