package com.keduits;

import java.util.Arrays;
import java.util.List;

public class Shape {

	private String type; // 도형의 종류
	private String color; // 도형의 색깔
	private Double area; // 도형의 면적

	public Shape() {}
	public Shape(String type, String color, double area) {
		this.type = type;
		this.color = color;
		this.area = area;
	}

	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public double getArea() {
		return area;
	}

	@Override
	public String toString() {
//		'도형타입(색상, 면적)'을 반환하는 toString() 메서드
		return type + "(" + color + area + ")";

	}

	public static List<Shape> shapes = Arrays.asList(new Shape("삼각형", "빨간색", 10.5), new Shape("사각형", "파란색", 11.2),
			new Shape("원", "파란색", 16.5), new Shape("원", "빨간색", 5.3), new Shape("원", "노란색", 8.1),
			new Shape("사각형", "파란색", 20.7), new Shape("삼각형", "파란색", 3.4), new Shape("사각형", "빨간색", 12.6));

}
