package com.keduits;

public class Exam3Test {
	
	enum  Direction{ // 열거타입
		DD("동"), SS("서"), LL("남"), BB("북");
		
		private String s;
		
		
		Direction(String s) {
			this.s = s;
		}
		
		public String toString() {
			return s;
		}


	}
	
	

	public static void main(String[] args) {
		
		// Direction.values() 열거타입의 상수 값을 열거타입의 d 넣는다.
		// d의 변수는 각 열거타입의 상수 값을 출력한다.
		for(Direction d: Direction.values()) {
			System.out.print(d + " ");
		}

	}

}
