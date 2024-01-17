package com.kediuts;

class Shape{
	
}
class Rectangle extends Shape{
	
}
class Circle extends Shape{
	
}

public class Exam02_CastExceptionTest {

	public static void main(String[] args) {
		

		Rectangle r = new Rectangle();
		
		try {
			casting(r);
		} catch (ClassCastException e) {
			System.out.println("형제 관계 형 변환 불가");
		}
		

	}
	
	static void casting(Shape s) throws ClassCastException{
//		ClassCastException 오류
		Circle c = (Circle) s;
	}

}
