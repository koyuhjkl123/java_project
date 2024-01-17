package com.keduits;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ShapeTest {

	public static void main(String[] args) {

		Shape sc = new Shape();
		
//		findShapesByType : 메서드
		List<Shape> shape = findShapesByType(Shape.shapes, sc.getType());
		System.out.println("사각형 : " + shape);

//		findShapesByColorNArea : 메서드
		List<Shape> shapeColor = findShapesByColorNArea(Shape.shapes, "빨간색", 12.0);
		System.out.println("빨간 도형(면적<=12.0)" + shapeColor);

//		findShapes : 메서드
		List<Shape> shapes = findShapes(Shape.shapes, "사각형", "빨간색", 12.0);
		System.out.println("사각형 : " + shapes.subList(0, 3) + "\n" + "빨간 도형(면적<=12.0)" + shapes.subList(3, 5));
		
		
//		findShape : 람다식을 이용
		List<Shape> shapes2 = findShape(Shape.shapes, t -> t.getType().equals("사각형"));
		System.out.println("사각형 : " + shapes2);
		List<Shape> shapes3 = findShape(Shape.shapes, t -> t.getColor().equals("빨간색") && t.getArea() <= 12.0);
		System.out.println("빨간 도형(면적<=12.0)" + shapes3);
		
		
		

	}

	static List<Shape> findShape(List<Shape> shapes, Predicate<Shape> p) {
//		Predicate : 매개값을 가지고, 논리값을 반환하며, test() 추상메서드를 가진 함수형 인터페이스

		List<Shape> test = new ArrayList<Shape>();
		for (Shape sh : shapes) {
			if(p.test(sh)) {
				test.add(sh);
			}
		}

		return test;
	}

	static List<Shape> findShapesByType(List<Shape> shapes, String type) {

//		Type이 사각형의 기준

		List<Shape> test = new ArrayList<Shape>();

		for (Shape sh : shapes) {
			if (sh.getType() == "사각형") {
				test.add(sh);
			}
		}
		return test;
	}

	static List<Shape> findShapesByColorNArea(List<Shape> shapes, String color, double area) {

//		color : 빨간색이면서 면적(area) 12.0이하인 객체 값을 출력
		List<Shape> test = new ArrayList<Shape>();

		for (Shape sh : shapes) {
			if (sh.getColor() == color && sh.getArea() <= area) {
				test.add(sh);
			}
		}
		return test;

	}

	
	static List<Shape> findShapes(List<Shape> shapes, String type, String color, Double area) {

//		도형타입이 사각형면서 색상은 빨간색, 면적은 12.0이하인 객체를 출력
//		위 두 메소드 합친 메소드를 작성해라
		List<Shape> findShapeType = findShapesByType(shapes, type);
		List<Shape> findShapeColor = findShapesByColorNArea(shapes, color, area);

		List<Shape> test = new ArrayList<>();
//

		test.addAll(findShapeType);
		test.addAll(findShapeColor);

		test.stream().distinct().collect(Collectors.toList());
//      stream : 스트림으로 변환
//		distinct : 스트림으로의 요소인 중복 제거
//		collect(Collectors.toList() : 중복이 제거된 요소들을 포함하는 새로운 리스트를 생성
		return test;

	}

}
