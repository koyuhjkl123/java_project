package com.keduit;


public class _01_Rectangle implements Comparable<_01_Rectangle> {

	private int width;
	private int height;
	
	
	public _01_Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int findArea() {
		return width * height;
	}
	
	@Override
	public String toString() {
//		toString() 오버라이딩 없을 시 부모 Object의 toString() 호출
//      부모의 toString()은 객체의 주소값을 반환
		return String.format("사각형[폭=%d, 높이=%d]", width, height);
	}
	
	@Override
	public int compareTo(_01_Rectangle o) {
		return this.findArea() - o.findArea(); // 오름차순
//		return o.findArea() - this.findArea(); // 내림차순
		
	}
}
