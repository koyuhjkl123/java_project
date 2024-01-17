package com.keduit;

public class EscapeSequence {

	public static void main(String[] args) {
		
		System.out.println("AB" + '\r' + 'c');
		System.out.println("AB" + "\b" + 'c');
		System.out.println("AB" + '\t' + 'c');
		System.out.println("AB" + '\n' + 'c');
	}

}
