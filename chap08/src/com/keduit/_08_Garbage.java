package com.keduit;

public class _08_Garbage {

	public int no;
	
	public _08_Garbage(int no) {
		this.no = no;
		System.out.printf("Garbage(%d) 생성%n", no);
	}
	
	protected void finalize() {
		System.out.printf("Garbage(%d) 수거%n", no);
	}

}
