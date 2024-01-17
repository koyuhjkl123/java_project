package com.keduit;

public class _05_TryCatch2Test {

	public static void main(String[] args) {
		
		int dividend = 10;
		
		try {
			int divisor = Integer.parseInt(args[0]);
			System.out.println(dividend / divisor);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("원소가 존재하지 않아요.");
		}catch (NumberFormatException e) {
			System.out.println("숫자가 아니군요.");
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없어요.");
		}finally {
			System.out.println("항상 처리되는 부분");
		}
		System.out.println("종료");

	}

}
