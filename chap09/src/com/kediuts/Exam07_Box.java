package com.kediuts;

public class Exam07_Box<T extends Object> {
	
	T nums;
	
	public T getBox() {
		return nums;
	}
	
	public void setBox(T nums) {
		this.nums = nums;
	}
	

}
