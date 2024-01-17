package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Emplayee e = new Emplayee(); // 지역변수 | 참조되는 인스턴스(동적 메모리)
		
		e.setEmoployeeName("이순신");
		System.out.println(Emplayee.getSerialNum());
		
		Emplayee em = new Emplayee();
		em.setEmoployeeName("김선생");
		
		System.out.println(e.getEmoployeeName() + "님의 사번은 " + e.getEmployeeId()); // e, em 생성자 호출 해도 같은 메모리에 생성되기 떄문에 증가된 값은 동일하다
		System.out.println(em.getEmoployeeName() + "님의 사번은 " + em.getEmployeeId()); // 다른 생성자 생성 해도 값은 증감된다.
		

	}

}
