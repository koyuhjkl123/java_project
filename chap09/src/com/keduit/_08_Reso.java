package com.keduit;

public class _08_Reso implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("자원 닫기");
	}
	
	void show() {
		System.out.println("자원 사용");
	}

}
