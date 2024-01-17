package com.keduits;

public class Printer {

	private int numOfPapers = 0;
	
	
	
	
	

	public void print2(int amount) {
		int nums = 0;
		if(numOfPapers > amount) {
			numOfPapers -= amount;
			System.out.printf("%d장 출력했습니다. 현재 %d장 남아 있습니다.\n", amount, numOfPapers);
		}else if(numOfPapers > 0 &&numOfPapers < amount) {
			
			numOfPapers -= amount;
			nums = amount + numOfPapers;
			System.out.printf("모두 출력하려면 용지가 %d매 부족합니다 %d장만 출력합니다.\n", numOfPapers*-1, nums);
		}else {
			System.out.println("용지가 없습니다.");
		}
	}
	
	public Printer(int numOfPapers) {
		this.numOfPapers = numOfPapers;
	}

}
