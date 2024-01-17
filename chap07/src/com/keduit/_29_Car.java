package com.keduit;

public class _29_Car implements _28_Movable {

	private int pos = 0;
	
	@Override
	public void move(int s) {
		pos += s;
	}
	
	public void show() {
		System.out.println(pos + "m 이동했습니다.");
	}

}
