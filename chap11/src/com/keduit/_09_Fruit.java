package com.keduit;

public class _09_Fruit {
	
	private String name;
	
//	매개변수 1개 있는 생성자
	public _09_Fruit(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() { // 주소값??
		return name != null ? name.hashCode() : 0;
	}

	@Override
	public boolean equals(Object o) {
		// Object 타입인 참조변수 o가 _09_Fruit 타입인지
		if(o instanceof _09_Fruit) { 
//			Object o 참조변수를 _09_Fruit 형타입으로 변환
//			참조변수 o에 있는 name과 equals.name과 비교
			return ((_09_Fruit)o).name.equals(name);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	
	
	
	
	

}
