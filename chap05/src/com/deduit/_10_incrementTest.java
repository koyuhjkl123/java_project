package com.deduit;

public class _10_incrementTest {

	public static void main(String[] args) {

		int[] x = { 0 };
		int[] y = {10};
		System.out.println("호출 전의 x[0] = " + x[0]);
		increment(x);
		System.out.println("호출 후의 x[0] = " + x[0]);
		
		
	}

	public static void increment(int[] x) { // 배열은 객체 참조변수이기 때문에 값의 영향을 준다.
		System.out.print("increment()에서 ");
		System.out.print("x[0]=" + x[0] + " --->" + x[0]++);//1
		System.out.println("x[0]= " + x[0]);
	}
	public static void increments(int[] y) {
		System.out.print("increment()에서 ");
		System.out.print("x[0]=" + y[0] + " --->" + y[0]++);
		System.out.println("x[0]= " + y[0]);
	}
}
