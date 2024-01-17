package com.keduit;

public class Tv {
	
	boolean power;
	int channel;
	
	void Power(boolean power) {
		power = !power;
		
		if(power) {
			System.out.println("TV를 켭니다.");
		}else {
			System.out.println("TV를 끕니다.");
		}
	}
	
	void Channel_Up(int channel) {
		this.channel += channel;
	}
	
	void Channel_Down(int channel) {
		this.channel -= channel;
	}

}
