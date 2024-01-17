package com.keduits;

public class Printer02Test {

	public static void main(String[] args) {
		
		Printer02 p = new Printer02(20, true);

		
		p.print(25);
		p.setDuplex(false);
		p.print(10);
	}

}
