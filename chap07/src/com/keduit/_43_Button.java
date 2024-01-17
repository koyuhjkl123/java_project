package com.keduit;

public class _43_Button {

	_44_OnClickListener listener;
	
	void setOnClickListener(_44_OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick(); // 인터페이스의 ocClick의 메소드를 갖고온다.
	}
	
}
