package com.keduit;

public interface _08_RemoteControl {
	// 인터페이스

	// 인터페이스 내의 필드는 암묵적으로 public static final 자동으로 붙는다.
	// 인터페이스 내 모든 필드가 공유 되어야 하므로 static 정적
	// final 모든 필드는 값을 변경 하면 안되기 때문에 final
	// 위 public static final 암묵적으로 디폴트값으로 갖는다.

	int MAX_VOLUMN = 10; // public static final 인터페이스 필드 생성 시 자동
	int MIN_VOLUMN = 0; // public static final 인터페이스 필드 생성 시 자동

	public void turnOn(); // 인터페이스 public abstract 메소드 자동

	public void turnOff();
	// 인터페이스의 메소드는 기본적으로 abstract(추상)이 붙는다.
	// 해당 인터페이스에 메소드를 선언 후 사용 할려면 반드시 다른 클래스에서
	// 추상 메소드를 구현하여 재정의를 해야한다.
	// 인터페이스는 구현을 강제하고 다른 클래스들이 공통된 동작을 정의할 수 있도록 하는데 사용되며,
	// 다중 상속과 비슷한 효과를 가질 수 있도록 해준다.

	// 인터페이스를 상속하려면 extends 키워드를 사용
	// 자식인터페이스 extends 부모인터페이스
	// 인터페이스를 구현하려면 implements 키워드를 사용
	// 자식클래스 implements 부모인터페이스
	void setvolumn(int volumn);
}
