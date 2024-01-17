package com.keduistest;

class Parent{
	private int parentField;
	
	public Parent(int value) {
		this.parentField = value;
	}
	
	public int getParentField() {
		return parentField;
	}
}


public class Test extends Parent{

	private int childField;
	
	public Test(int parentValue, int childValue) {
		super(parentValue); // 부모 클래스의 생성자 호출 || super키워드는 부모클래스를 가리키는데 사용
		// super() : 부모 클래스 생성자를 호출하는데 사용
		this.childField = childValue;
	}
	
	public int getChildField() {
		return childField;
	}
	
	
	public static void main(String[] args) {
		
		Test t1 = new Test(10, 5); // 10 : 부모 클래스의 인자값 전달, 5 : 자식 클래스에 인자값 전달 
		
		System.out.println(t1.childField);
		System.out.println(t1.getParentField());
	}
}
