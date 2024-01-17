package com.keduit;

public class _30_GenMethod2Test {

	static class Utils{
		public static <T extends Number> void showArray(T[] a) {
			
			for(T t:a) {
				System.out.printf("%s ", t);
			}
			System.out.println();
		}
		
		public static <T> T getLast(T[] a) {
			return a[a.length-1];
		}
	}
	public static void main(String[] args) {

		Integer[] ia = {10, 20, 30, 40, 50};
		Double[] da = {10.0, 20.0, 30.0, 40.0, 50.0};
		Character[] ca = {'H', 'e', 'l', 'l', 'o'};
		
		Utils.showArray(ia);
		Utils.showArray(da);
//		Utils.showArray(ca); //Character : Number의 하위 클래스가 아니라서 오류 발생
		
//		Number => : Byte, Short, Integer, Long, Float, Double
		
		System.out.println(Utils.getLast(ia));
		System.out.println(Utils.getLast(da));
		System.out.println(Utils.getLast(ca)); //위 메소드에서 ca 호출하는것과 동일한 오류이다.
//		다만 Number => Object 클래스로 변경 하면 오류는 발생하지 않는다.
//		<T extends Object> => <T>를 해도 값은 동일함, Object는 최상위 클래스이기 때문
		
	}

}
