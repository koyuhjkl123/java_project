
package com.keduit;

class Circle {
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
}
public class _22Methold_overloding {
	
	public static int max(int n1, int n2) {
		int result = n1 > n2 ? n1 : n2;
		return result;
	}
	
	public static double max(double n1, double n2) {
		double result = n1 > n2 ? n1 : n2;
		return result;
	}
	public static int max(int n1, int n2, int n3) {
		int result = max(max(n1, n2),n3);
		return result;
	}

	public static void zero(Circle c) {
		c.radius = 5.0;
	}
	public static void zero(double r) {
		r = 0.0;
	}
	public static void main(String[] args) {
	

		Circle c1 = new Circle(10.0);
		Circle c2 = new Circle(10.0);
		
		zero(c1);
		System.out.println(c1.radius);
		zero(c2.radius);
		System.out.println(c2.radius);
		
		int num1 = 3;
		int num2 = 8;
		int num3 = 10;
		
		double d1 = 10.0, d2 = 100.0;
		
		System.out.printf("max(%d, %d) = %d\n", num1, num2, max(num1, num2));
		System.out.printf("max(%.1f, %.1f) = %.1f\n", d1, d2, max(d1, d2));
		
	}

}
