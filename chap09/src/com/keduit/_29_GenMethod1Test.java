package com.keduit;

public class _29_GenMethod1Test {
	
	static class Utils{
		public static <T> void showArray(T[] a) {
			
			for(T t: a) {
				System.out.printf("%s ", t);
			}
			System.out.println();
		}
		
//		T타입의 T타입의 배열
		public static <T> T getLast(T[] a) {
			return a[a.length-1];
		}
	}

	public static void main(String[] args) {
		
		Integer[] ia = {1, 2, 3, 4, 5};

		Character[] ca = {'H', 'e', 'l', 'l', 'o'};
		
		Utils.showArray(ia);
		Utils.showArray(ca);
		System.out.println(Utils.getLast(ia));
		System.out.println(Utils.getLast(ca));
	}

}
