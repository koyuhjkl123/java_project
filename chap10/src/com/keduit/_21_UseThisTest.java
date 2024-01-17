package com.keduit;


public class _21_UseThisTest {
	
	public void lambda() {
		String hi = "hi!";
		_20_UseThis u1 = new _20_UseThis() {
			
//			익명객체 this
//			해당 익명객체 자체를 가리키며, println(toString)메서드가 자동으로 호출되기때문에
//			Object클래스의 toString값이 나온다.
//			_21_UseThisTest에 안에 있는 내부 익명객체의 주소값  com.keduit._21_UseThisTest$1@42f93a98
//			$1은 내부클래스, $1 오른쪽에 있는 값은 익명객체의 주소값
			
			@Override
			public void use() {
//				this : 익명객체 자신
				System.out.println(this);
				System.out.println(hi);
//				hi = "in use";
//				익명객체 외부의 메소드 지역변수는 익명객체내에서는
//				final이라 호출은 가능하지만 값의 변경은 불가
			}
		};
		u1.use();
		
//		람다표현식 this
//		해당 선언 타입의 클래스가 아닌 외부클래스의 인스턴스를 가리킴(_21_UseThisTest)
//		_21_UseThisTest클래스의 내부에 toString 오버라이딩으로 재정의된 값이 호출
//		println으로 되어있기 때문에 toString값이 자동적으로 호출된다.
		
		_20_UseThis u2 = () -> {
			System.out.println(this);
			System.out.println("hi");
//			hi = "in use"; 에러
		};
		
		u2.use();
	}

	@Override
	public String toString() {
		return "UseThisTest입니다.";
	}
	public static void main(String[] args) {
		
		new _21_UseThisTest().lambda();
	}
}
