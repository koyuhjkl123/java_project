package com.keduit;

public class _07_SystemTest {

	public static void main(String[] args) {

		int[] src = { 1, 2, 3, 4, 5, 6 };
		int[] dst = { 100, 200, 300, 400, 500, 600, 700 };

//		arraycopy : src, 2, dst, 3, 4
//		src, 2 : src 배열에 2부터 5번째 까지 dst으로 전달
//		dst, 3 : dst 배열에 3부터 6번째 까지 src의 값으로 변경
//		4 : 길이

		System.arraycopy(src, 2, dst, 3, 4);// Object, int, Object, int, int

		for (int i : dst) {
			System.out.print(i + " ");
		}

		System.out.println();

		System.out.println(System.currentTimeMillis());
		System.out.println(System.getenv("JAVA_HOME"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.nanoTime());

		long time1 = System.nanoTime();
		int sum = 0;
		for (int i = 1; i < 10000000; i++) {
			sum += i;
		}

		long time2 = System.nanoTime();
		System.out.println("1~10000000까지의 합: " + sum);
		System.out.println("계산에 " + (time2-time1) + " 나노초가 소요됨.");
	}

}
