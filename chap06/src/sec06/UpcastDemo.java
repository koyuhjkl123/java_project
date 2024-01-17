package sec06;

public class UpcastDemo {

	public static void main(String[] args) {
		
//		Person p;
//		Student s = new Student();
//		
//		p = s; // 자동으로 타입 변환되며, p = (Person)s와 동일하다.
//		
//		System.out.println(s.number);
//		p.whoami();
		
		Student s = new Student();
		Person p = new Person();
//		Student s = (Student) p; // Student 클래스가 Person 부모 클래스에게 상속을 물려 받았기 때문에
//		강제 형타입이 가능해 보일거 같지만 상속 extends 안하면 오류 발생
		
//		객체 지향 프로그래밍에서 상속 관계에 있는 클래스들 간에 발생하는 형변환입니다. 
//		이때 하위 클래스의 객체가 상위 클래스로 자동으로 형변환되는 것을 의미합니다.
		
//		변수 instanceof 타입 :
//		변수 : 객체를 참조하는 변수
//		instanceof : boolean 값을 반환
//		타입 : 클래스 이름 혹은 인터페이스 이름
		
		System.out.println(s instanceof Person);
		// s Person 자식 타입이므로 true
		System.out.println(s instanceof Student);
//		s Student 타입이므로 true
		System.out.println(p instanceof Student);
//		p Student 타입도 아니고 Student 자식 타입도 아니므로 false
		
//		System.out.println(s instanceof String);
		// s String 타입과 관계없으므로 오류가 발생한다.
		
		downcast(s);
		
		
		
		

	}

	static void downcast(Person p) { // 인수로 Person 타입 혹은 Person 자식타입을 받을 수 있다.
		if(p instanceof Student) {
			Student s = (Student) p; // p 실제 타입이 Student 타입이므로 강제 타입 변환할 수 있다.
			System.out.println("ok, 하양 타입 변환");
		}
	}

}
