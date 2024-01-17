package com.keduit;

public class _19Methold4 {
	
	static void printScore(int score) {
		
		if(score < 0 || score > 100) {
			System.out.println("잘못된 점수 " + score);
			return; // 안하면 아래 프린트라인까지 함께 옴
		}
		System.out.println("점수 " + score);
	}

	public static void main(String[] args) {
		
		printScore(99);
		printScore(120);
		

	}

}
