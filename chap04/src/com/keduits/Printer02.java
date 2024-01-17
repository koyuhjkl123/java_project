package com.keduits;

public class Printer02 {
	
	private int numOfPapers;
	private boolean duplex;
	
	
	public Printer02(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}
	
	public void print(int amount) {
		
		int nums = 0;
		if (duplex == true) { // 출력해야 할 수가 더 적을 경우
			if ((amount % 2) == 0) { // amount값이 짝수일 때
				numOfPapers -= amount / 2;
				System.out.printf("양면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.\n", (amount / 2), numOfPapers);
			} else {                            
				numOfPapers -= (amount / 2) +1; // = 20 - (25 /2)+1
				System.out.printf("양면으로 %d장 출력했습니다. 현재 %d장 남 있습니다.\n", (amount / 2) + 1, numOfPapers);
			}
		} else {
			if (numOfPapers > amount) {  
				numOfPapers -= amount;  // 남아있는 용지의 수 - 출력해야할 수
				System.out.printf("단면으로 모두 출력하여 용지 %d장을 출력하고 남아있는 용지는 %d장 입니다.\n", amount, numOfPapers);
			} else {                       // 출력해야 할 수가 더 많을 경우
				numOfPapers -= amount;   
				nums = numOfPapers + amount;  
				System.out.printf("단면으로 모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", (numOfPapers * -1), nums);
			}
		}
	}
	
	public boolean getDuplex() {
		return duplex;
	}
	
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
		
	}


}
