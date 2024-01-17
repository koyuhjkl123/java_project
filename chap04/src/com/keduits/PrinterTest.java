package com.keduits;

public class PrinterTest {

	public static void main(String[] args) {

//		Printer prints = new Printer();
//
//		System.out.println(prints.numOfPapers);
//		prints.numOfPapers = 100;
//
//		prints.print(70);
//		
//		System.out.println(prints.numOfPapers);
		
		Printer demoPrinter = new Printer(10); // 객체 생성
		demoPrinter.print2(2);
		demoPrinter.print2(20);
		demoPrinter.print2(10);
	}

}
