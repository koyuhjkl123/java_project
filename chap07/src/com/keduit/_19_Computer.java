package com.keduit;

public class _19_Computer implements _16_RemoteControllable{

	@Override
	public void turnOn() {
		System.out.println("Pc를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Pc를 끕니다.");
	}

	@Override
	public void remoteOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remoteOff() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void repair() {
		show("Pc를 수리합니다.");
	}
	
	private void show(String s) {
		System.out.println(s);
	}

	
}
