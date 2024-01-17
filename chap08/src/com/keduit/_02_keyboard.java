package com.keduit;

public class _02_keyboard {

	String name;
	
	public _02_keyboard(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof _02_keyboard) {
			_02_keyboard keyboard = (_02_keyboard)obj;
			if(name.equals(keyboard.name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "키보드입니다.";
	}
	
	
	
}
